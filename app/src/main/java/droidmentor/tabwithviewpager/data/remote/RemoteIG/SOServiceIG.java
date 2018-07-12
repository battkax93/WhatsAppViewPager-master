package droidmentor.tabwithviewpager.data.remote.RemoteIG;


import java.util.List;

import droidmentor.tabwithviewpager.Globals;
import droidmentor.tabwithviewpager.data.model.Answer.Answer;
import droidmentor.tabwithviewpager.data.model.Answer2.Answer2;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Chike on 12/3/2016.
 */


public interface SOServiceIG {

    String url = Globals.BASE_URL_INSTAGRAM_GETPHOTO;

    @GET(url)
    Call<Answer2> getAnswers();

    @GET(url)
    Call<Answer2> getDisplayImage();
    // RxJava
    // Observable<SOAnswersResponse> getAnswers();

    @GET(url)
    Call<List<Answer2>> getAnswers(@Query("tagged") String tags);


}
