
package droidmentor.tabwithviewpager.data.model.Answer2;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Edge_ implements Serializable
{

    @SerializedName("node")
    @Expose
    private Node_ node;
    private final static long serialVersionUID = -5063048545913030773L;

    public Node_ getNode() {
        return node;
    }

    public void setNode(Node_ node) {
        this.node = node;
    }

}
