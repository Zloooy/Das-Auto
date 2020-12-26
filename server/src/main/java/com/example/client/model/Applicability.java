package com.example.client.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "applicabilities")
public class Applicability extends Identified {

    @ManyToMany
    @JoinTable(
            name="part_type_applicability_relation",
            joinColumns = @JoinColumn(name = "part_type_id"),
            inverseJoinColumns = @JoinColumn(name = "applicability_id")
    )
    private List<PartType> applicableParts = new ArrayList<>();
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="carModelId", referencedColumnName = "id", nullable = false)
    private final CarModel carModel;

    public Applicability(long id, CarModel carModel) {
        super(id);
        this.carModel = carModel;
    }

    public CarModel getCarModel() {
        return carModel;
    }
    public List<PartType> getApplicableParts() {
        return applicableParts;
    }
    public void addApplicablePartType(PartType p)
    {
        applicableParts.add(p);
    }
}

