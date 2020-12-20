package com.example.server.model;


import javax.persistence.*;

@MappedSuperclass
public class Identified {
    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    Identified(long id)
    {
        this.id=id;
    }
    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public boolean equals(Object o)
    {
        if (o==this) return true;
        if (!(o instanceof Identified)) return false;
        Identified other = (Identified)o;
        return this.id == other.id;
    }

    public void resetId() {
        id = null;
    }
}
