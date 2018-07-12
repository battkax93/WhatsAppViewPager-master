
package droidmentor.tabwithviewpager.data.model.Answer2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EdgeMediaToSponsorUser implements Serializable
{

    @SerializedName("edges")
    @Expose
    private List<Object> edges = new ArrayList<Object>();
    private final static long serialVersionUID = 7593915696560923536L;

    public List<Object> getEdges() {
        return edges;
    }

    public void setEdges(List<Object> edges) {
        this.edges = edges;
    }

}
