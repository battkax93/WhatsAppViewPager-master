package droidmentor.tabwithviewpager.data.remote.RemoteStack;

import droidmentor.tabwithviewpager.Globals;

/**
 * Created by Chike on 12/4/2016.
 */

public class ApiUtils {


    private ApiUtils() {}

    //set baseUrl & time out here
    public static SOService getSOService() {
        return RetrofitClient.getClient(Globals.BASE_URL_STACK,Globals.timeout).create(SOService.class);
    }
}
