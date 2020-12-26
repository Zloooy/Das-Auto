package com.example.client.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="part_statuses")
public class PartStatus extends Identified {
    @Column(name="name")
    private String name;

    public PartStatus()
    {
        super(1);
    }
    public PartStatus(long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
