
package droidmentor.tabwithviewpager.data.model.Answer2;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Location implements Serializable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("has_public_page")
    @Expose
    private Boolean hasPublicPage;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("slug")
    @Expose
    private String slug;
    private final static long serialVersionUID = 8335995464836660649L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getHasPublicPage() {
        return hasPublicPage;
    }

    public void setHasPublicPage(Boolean hasPublicPage) {
        this.hasPublicPage = hasPublicPage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

}
