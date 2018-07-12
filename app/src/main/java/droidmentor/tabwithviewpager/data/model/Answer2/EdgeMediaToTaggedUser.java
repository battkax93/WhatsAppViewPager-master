
package droidmentor.tabwithviewpager.data.model.Answer2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EdgeMediaToTaggedUser implements Serializable
{

    @SerializedName("edges")
    @Expose
    private List<Edge> edges = new ArrayList<Edge>();
    private final static long serialVersionUID = 1187600311554463724L;

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

}
