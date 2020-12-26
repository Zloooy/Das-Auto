package com.example.client.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="mechanic_specializations")
public class MechanicSpecialization extends Identified {

    @Column(name="name")
    private final String name;
    @ManyToMany
    @JoinTable(
            name="mechanics_specialisations_relation",
            joinColumns = @JoinColumn(name = "mechanic_id"),
            inverseJoinColumns = @JoinColumn(name = "specialization_id")
    )
    private List<Mechanic> mechanics = new ArrayList<>();

    public MechanicSpecialization(long id, String name) {
        super(id);
        this.name = name;
    }

    public MechanicSpecialization() {
        super(1);
        this.name = "";
    }

    public List<Mechanic> getMechanics()
    {
        return mechanics;
    }
    public String getName() {
        return name;
    }
}
