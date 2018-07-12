
package droidmentor.tabwithviewpager.data.model.Answer2;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Edge____ implements Serializable
{

    @SerializedName("node")
    @Expose
    private Node____ node;
    private final static long serialVersionUID = 4623366772842022565L;

    public Node____ getNode() {
        return node;
    }

    public void setNode(Node____ node) {
        this.node = node;
    }

}
