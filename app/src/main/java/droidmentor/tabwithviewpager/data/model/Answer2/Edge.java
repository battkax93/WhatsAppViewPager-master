
package droidmentor.tabwithviewpager.data.model.Answer2;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Edge implements Serializable
{

    @SerializedName("node")
    @Expose
    private Node node;
    private final static long serialVersionUID = -4613925999561056800L;

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

}
