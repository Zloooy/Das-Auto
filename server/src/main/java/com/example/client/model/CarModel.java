package com.example.client.model;

import javax.persistence.*;

@Entity
@Table(name="car_models")
public class CarModel extends Identified {

    @Column(name="name")
    private String name;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="mark_id")
    private CarMark mark;

    public CarModel(long id, String name, CarMark mark) {
        super(id);
        this.name = name;
        this.mark = mark;
    }

    public CarModel() {
        super(1);
    }

    public String getName() {
        return name;
    }
}

