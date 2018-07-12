package droidmentor.tabwithviewpager.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import droidmentor.tabwithviewpager.R;
import droidmentor.tabwithviewpager.data.model.Answer2.Answer2;
import droidmentor.tabwithviewpager.data.remote.RemoteIG.ApiUtilsIIG;
import droidmentor.tabwithviewpager.data.remote.RemoteIG.SOServiceIG;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ChatFragment extends Fragment {

    ImageView ivTest;
    SOServiceIG soServiceIG;

    public ChatFragment() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View Chat = inflater.inflate(R.layout.fragment_chat, container, false);
        soServiceIG = ApiUtilsIIG.getSOService();
        ivTest = (ImageView) Chat.findViewById(R.id.iv_test);

        loadAnswerIG();
        /*Picasso.get().load("https://instagram.fcgk7-1.fna.fbcdn.net/vp/2b5610fd8a06ba3785f91482319e74e4/5BD083CF/t51.2885-15/e35/34188084_117899155717141_6597137352261369856_n.jpg")
                .into(ivTest);*/

        // Inflate the layout for this fragment
        return Chat;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_chat_fragment, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    public void loadAnswerIG() {
        soServiceIG.getAnswers().enqueue(new Callback<Answer2>() {
            @Override
            public void onResponse(Call<Answer2> call, Response<Answer2> response) {
                if (response.isSuccessful()) {
                    String url = response.body().getGraphql().getShortcodeMedia().getDisplayUrl();
                    Log.d("==Tag", url);
                    Picasso.get().load(url).into(ivTest);
                } else {
                    Toast.makeText(getContext(), "Check your connection", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Answer2> call, Throwable t) {
                Toast.makeText(getContext(), "Check your connection", Toast.LENGTH_SHORT).show();

            }
        });
    }

}
