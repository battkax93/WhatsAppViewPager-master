
package droidmentor.tabwithviewpager.data.model.Answer2;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Edge__ implements Serializable
{

    @SerializedName("node")
    @Expose
    private Node__ node;
    private final static long serialVersionUID = -5870682600851236505L;

    public Node__ getNode() {
        return node;
    }

    public void setNode(Node__ node) {
        this.node = node;
    }

}
