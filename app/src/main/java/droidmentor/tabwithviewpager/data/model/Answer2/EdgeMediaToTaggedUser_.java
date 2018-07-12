
package droidmentor.tabwithviewpager.data.model.Answer2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EdgeMediaToTaggedUser_ implements Serializable
{

    @SerializedName("edges")
    @Expose
    private List<Edge_____> edges = new ArrayList<Edge_____>();
    private final static long serialVersionUID = 63673409718403539L;

    public List<Edge_____> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge_____> edges) {
        this.edges = edges;
    }

}
