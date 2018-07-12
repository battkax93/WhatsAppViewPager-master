
package droidmentor.tabwithviewpager.data.model.Answer2;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DisplayResource_ implements Serializable
{

    @SerializedName("src")
    @Expose
    private String src;
    @SerializedName("config_width")
    @Expose
    private Integer configWidth;
    @SerializedName("config_height")
    @Expose
    private Integer configHeight;
    private final static long serialVersionUID = 2432991871239575810L;

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public Integer getConfigWidth() {
        return configWidth;
    }

    public void setConfigWidth(Integer configWidth) {
        this.configWidth = configWidth;
    }

    public Integer getConfigHeight() {
        return configHeight;
    }

    public void setConfigHeight(Integer configHeight) {
        this.configHeight = configHeight;
    }

}
