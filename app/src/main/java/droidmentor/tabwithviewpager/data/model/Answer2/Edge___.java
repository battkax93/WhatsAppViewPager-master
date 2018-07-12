
package droidmentor.tabwithviewpager.data.model.Answer2;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Edge___ implements Serializable
{

    @SerializedName("node")
    @Expose
    private Node___ node;
    private final static long serialVersionUID = 3267117602507472172L;

    public Node___ getNode() {
        return node;
    }

    public void setNode(Node___ node) {
        this.node = node;
    }

}
