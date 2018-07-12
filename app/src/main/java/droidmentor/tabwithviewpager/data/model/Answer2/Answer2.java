
package droidmentor.tabwithviewpager.data.model.Answer2;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Answer2 implements Serializable
{

    @SerializedName("graphql")
    @Expose
    private Graphql graphql;
    private final static long serialVersionUID = -6888978438073867161L;

    public Graphql getGraphql() {
        return graphql;
    }

    public void setGraphql(Graphql graphql) {
        this.graphql = graphql;
    }

}
