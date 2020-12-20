package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserView extends IdentifiedView {
    private String login;
    private String password;

    private final UserRoleView role;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRoleView getRole() {
        return role;
    }

    public UserView(long id, String login, String password, UserRoleView role) {
        super(id);
        this.login = login;
        this.password = password;
        this.role = role;
    }

}
