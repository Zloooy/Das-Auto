package com.example.client.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="work_types")
public class WorkType extends Identified {
    @Column(name="name")
    private String name;
    @Column(name="price")
    private int price;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="mechanic_specialization_id")
    private MechanicSpecialization mechanicSpecialization;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="part_type_work_type_relation",
    joinColumns = @JoinColumn(name="part_type_id"),
    inverseJoinColumns = @JoinColumn(name="work_type_id"))
    private List<PartType> partTypes = new ArrayList<>();

    public WorkType(long id, String name, int price, MechanicSpecialization mechanicSpecialization, PartType partType) {
        super(id);
        this.name = name;
        this.price = price;
        this.mechanicSpecialization = mechanicSpecialization;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public List<PartType> getPartTypes() {
        return partTypes;
    }

    public MechanicSpecialization getMechanicSpecialization() {
        return mechanicSpecialization;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
