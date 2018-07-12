package droidmentor.tabwithviewpager.data.remote.RemoteStack;


import java.util.List;

import droidmentor.tabwithviewpager.Globals;
import droidmentor.tabwithviewpager.data.model.Answer.Answer;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Chike on 12/3/2016.
 */


public interface SOService {

    String url = Globals.BASE_URL_STACK2;

    @GET(url)
    Call<Answer> getAnswers();

    @GET(url)
    Call<Answer> getDisplayImage();
    // RxJava
    // Observable<SOAnswersResponse> getAnswers();

    @GET(url)
    Call<List<Answer>> getAnswers(@Query("tagged") String tags);


}
