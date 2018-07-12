
package droidmentor.tabwithviewpager.data.model.Answer2;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Node_ implements Serializable
{

    @SerializedName("text")
    @Expose
    private String text;
    private final static long serialVersionUID = 3671989798238589150L;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
