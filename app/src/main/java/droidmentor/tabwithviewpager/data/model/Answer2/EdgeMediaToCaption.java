
package droidmentor.tabwithviewpager.data.model.Answer2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EdgeMediaToCaption implements Serializable
{

    @SerializedName("edges")
    @Expose
    private List<Edge_> edges = new ArrayList<Edge_>();
    private final static long serialVersionUID = 6463224439501562463L;

    public List<Edge_> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge_> edges) {
        this.edges = edges;
    }

}
