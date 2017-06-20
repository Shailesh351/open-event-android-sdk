package openevent.model.api;

import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Type;

@Type("session-type")
public class ApiSessionType {

    //TODO: Add relationships with other classes(event, sessions)

    @Id
    private String id;
    private String name;
    private String length;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "ApiSessionType{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", length='" + length + '\'' +
                '}';
    }
}
