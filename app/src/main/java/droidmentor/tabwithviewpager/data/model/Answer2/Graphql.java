
package droidmentor.tabwithviewpager.data.model.Answer2;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Graphql implements Serializable
{

    @SerializedName("shortcode_media")
    @Expose
    private ShortcodeMedia shortcodeMedia;
    private final static long serialVersionUID = 8404754327250239505L;

    public ShortcodeMedia getShortcodeMedia() {
        return shortcodeMedia;
    }

    public void setShortcodeMedia(ShortcodeMedia shortcodeMedia) {
        this.shortcodeMedia = shortcodeMedia;
    }

}
