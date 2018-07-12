
package droidmentor.tabwithviewpager.data.model.Answer2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EdgeSidecarToChildren implements Serializable
{

    @SerializedName("edges")
    @Expose
    private List<Edge____> edges = new ArrayList<Edge____>();
    private final static long serialVersionUID = 3220909943407224150L;

    public List<Edge____> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge____> edges) {
        this.edges = edges;
    }

}
