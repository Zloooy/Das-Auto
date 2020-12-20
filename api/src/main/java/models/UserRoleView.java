package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserRoleView extends IdentifiedView {

    private String name;

    public UserRoleView(long id, String name) {
        super(id);
        this.name = name;
    }

    public UserRoleView() {
        super(1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
