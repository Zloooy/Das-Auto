package models;

public class User extends Identified<User>{
    private String login;
    private String password;
    private Id<UserRole> roleId;
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

    public User(Id<User> id,String login, String password, Id<UserRole> roleId) {
        super(id);
        this.login = login;
        this.password = password;
        this.roleId = roleId;
    }

}
