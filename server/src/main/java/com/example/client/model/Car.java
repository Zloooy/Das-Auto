package com.example.client.model;

import javax.persistence.*;

@Entity
@Table(name="cars")
public class Car extends Identified {
    @ManyToOne
    @JoinColumn(name="model_id")
    private CarModel model;
    @Column(name="vin")
    private String vin;

    Car(long id, CarModel model, String vin) {
        super(id);
        this.model = model;
        this.vin=vin;
    }

    public Car() {
        super(1);
    }

    public String getVin() {
        return vin;
    }

    public CarModel getModel() {
        return model;
    }
}
