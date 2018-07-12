
package droidmentor.tabwithviewpager.data.model.Answer2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EdgeMediaPreviewLike implements Serializable
{

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("edges")
    @Expose
    private List<Edge___> edges = new ArrayList<Edge___>();
    private final static long serialVersionUID = 4934045779759428787L;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Edge___> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge___> edges) {
        this.edges = edges;
    }

}
