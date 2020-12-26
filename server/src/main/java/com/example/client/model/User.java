package com.example.client.model;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User extends Identified {
    @Column(name="login", nullable = false)
    private String login;
    @Column(name="password", nullable = false)
    private String password;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="roleId", referencedColumnName = "id", nullable = false)
    private final UserRole role;

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

    public UserRole getRole() {
        return role;
    }

    public User(){
        super(1);
        role = null;
    };
    public User(long id, String login, String password, UserRole role) {
        super(id);
        this.login = login;
        this.password = password;
        this.role = role;
    }

}
