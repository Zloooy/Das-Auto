package com.example.client.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="car_marks")
public class CarMark extends Identified {
    @Column(name="name")
    private String name;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "mark_id")
    private List<CarModel> models;

    public CarMark(long id, String name) {
        super(id);
        this.name = name;
    }

    public CarMark() {
        super(1);
    }

    public String getName() {
        return name;
    }
}
