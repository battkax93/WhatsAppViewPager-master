
package droidmentor.tabwithviewpager.data.model.Answer2;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User_ implements Serializable
{

    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("id")
    @Expose
    private String id;
    private final static long serialVersionUID = 7598867786368595112L;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
