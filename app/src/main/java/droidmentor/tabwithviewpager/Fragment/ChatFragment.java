package droidmentor.tabwithviewpager.Fragment;


import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;
import droidmentor.tabwithviewpager.R;
import droidmentor.tabwithviewpager.ViewPager.CustomTabActivity;
import droidmentor.tabwithviewpager.data.model.Answer2.Answer2;
import droidmentor.tabwithviewpager.data.remote.RemoteIG.ApiUtilsIIG;
import droidmentor.tabwithviewpager.data.remote.RemoteIG.SOServiceIG;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ChatFragment extends Fragment {

    Dialog dialog;
    LinearLayout l1;

    TextView tvUsername;
    ImageView ivTest;
    CircleImageView ivPP;

    LottieAnimationView lottieAnimationView;
    ValueAnimator animator;

    CustomTabActivity ca = new CustomTabActivity();

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

        l1 = (LinearLayout) Chat.findViewById(R.id.l1);

        lottieAnimationView = (LottieAnimationView) Chat.findViewById(R.id.lottieAnimationView);
        ivTest = (ImageView) Chat.findViewById(R.id.iv_test);
        ivPP = (CircleImageView) Chat.findViewById(R.id.ivPP);
        tvUsername = (TextView) Chat.findViewById(R.id.tv_username);

//        ca.showDialog(getActivity());
        loadAnswerIG();

        return Chat;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_chat_fragment, menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    private void startCheckAnimation() {
        animator = ValueAnimator.ofFloat(0f, 1f).setDuration(1000);
        animator.start();
//        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//            @Override
//            public void onAnimationUpdate(ValueAnimator valueAnimator) {
//                lottieAnimationView.setProgress((Float) valueAnimator.getAnimatedValue());
//            }
//        });
//
//        if (lottieAnimationView.getProgress() == 0f) {
//            animator.start();
//        } else {
//            lottieAnimationView.setProgress(0f);
//        }
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("==TAG","==onResume==");
        loadAnswerIG();
    }

    public void loadAnswerIG() {
        soServiceIG.getAnswers().enqueue(new Callback<Answer2>() {
            @Override
            public void onResponse(Call<Answer2> call, Response<Answer2> response) {
                if (response.isSuccessful()) {
//                    ca.removeDialog();
                    l1.setVisibility(View.VISIBLE);
                    ivTest.setVisibility(View.VISIBLE);

                    Log.d("==TAG", "Succes");
                    String url = response.body().getGraphql().getShortcodeMedia().getDisplayUrl();
                    String name = response.body().getGraphql().getShortcodeMedia().getOwner().getUsername();
                    String pp = response.body().getGraphql().getShortcodeMedia().getOwner().getProfilePicUrl();
                    Log.d("==Tag", url);

                    Picasso.get().load(pp).into(ivPP);
                    tvUsername.setText(name);
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
