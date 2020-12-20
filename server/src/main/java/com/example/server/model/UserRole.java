package com.example.server.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user_roles")
public class UserRole extends Identified {

    @Column(name="name", nullable = false)
    private String name;

    public UserRole(long id, String name) {
        super(id);
        this.name = name;
    }

    public UserRole() {
        super(1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
