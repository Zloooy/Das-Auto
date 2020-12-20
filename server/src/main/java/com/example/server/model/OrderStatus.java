package com.example.server.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="order_statuses")
public class OrderStatus extends Identified {
    @Column(name="name")
    private String name;

    public OrderStatus()
    {
        super(1);
    }
    public OrderStatus(long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
