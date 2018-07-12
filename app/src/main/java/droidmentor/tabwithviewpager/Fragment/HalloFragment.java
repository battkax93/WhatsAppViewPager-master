package droidmentor.tabwithviewpager.Fragment;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import droidmentor.tabwithviewpager.Adapter.xAdapter;
import droidmentor.tabwithviewpager.DividerItemDecoration;

import droidmentor.tabwithviewpager.R;
import droidmentor.tabwithviewpager.ViewPager.CustomTabActivity;
import droidmentor.tabwithviewpager.data.model.Answer.Answer;
import droidmentor.tabwithviewpager.data.model.Answer.Item;
import droidmentor.tabwithviewpager.data.remote.RemoteStack.ApiUtils;
import droidmentor.tabwithviewpager.data.remote.RemoteStack.SOService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class HalloFragment extends Fragment {

    xAdapter mAdapster;
    RecyclerView recyclerView;
    SwipeRefreshLayout swipeRefreshLayout;
    ProgressDialog progress;

    CustomTabActivity ca = new CustomTabActivity();
    Boolean isRefreshing = false;

    SOService mServices;

    public HalloFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View halo = inflater.inflate(R.layout.fragment_hallo,container,false);
        recyclerView = (RecyclerView) halo.findViewById(R.id.rv_answers);
        swipeRefreshLayout = (SwipeRefreshLayout) halo.findViewById(R.id.swiperefresh);
        mServices = ApiUtils.getSOService();
        mAdapster = new xAdapter(getContext(), new ArrayList<Item>(0));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mAdapster);
        recyclerView.setHasFixedSize(true);
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL_LIST);
        recyclerView.addItemDecoration(itemDecoration);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                isRefreshing = true;
                loadAnswers();
            }
        });

        ca.showDialog(getActivity());
        loadAnswers();

        return halo;
    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_hallo_fragment, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    public void loadAnswers() {
        mServices.getAnswers().enqueue(new Callback<Answer>() {
            @Override
            public void onResponse(Call<Answer> call, Response<Answer> response) {
                ca.removeDialog();
                if (response.isSuccessful()) {
                    if (isRefreshing) {
                        swipeRefreshLayout.setRefreshing(false);
                        isRefreshing = false;
                    }
                    mAdapster.updateAnswers(response.body().getItems());
                } else {
                    Toast toast = new Toast(getContext());
                    Toast.makeText(getContext(),"Check your connection", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 0);
                    toast.show();
                }
            }

            @Override
            public void onFailure(Call<Answer> call, Throwable t) {
                progress.dismiss();
                Toast toast = new Toast(getContext());
                Toast.makeText(getContext(),"Check your connection", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 0);
                toast.show();
            }
        });
    }
}
