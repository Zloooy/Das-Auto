package com.example.client.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "payment_types")
public class PaymentType extends Identified {
    @Column(name="name")
    String name;

    public PaymentType(long id, String name) {
        super(id);
        this.name = name;
    }

    public PaymentType() {
        super(1);
    }

    public String getName() {
        return name;
    }
}
