package droidmentor.tabwithviewpager.data.remote.RemoteIG;

import droidmentor.tabwithviewpager.Globals;

/**
 * Created by Chike on 12/4/2016.
 */

public class ApiUtilsIIG {


    private ApiUtilsIIG() {}

    //set baseUrl & time out here
    public static SOServiceIG getSOService() {
        return RetrofitClientIG.getClient(Globals.BASE_URL_INSTAGRAM,Globals.timeout).create(SOServiceIG.class);
    }
}
