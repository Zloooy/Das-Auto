package com.example.client.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "part_models")
public class PartModel extends Identified{

    @Column(name="name")
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="part_type_id")
    private PartType partType;
    @OneToMany(mappedBy="partModel")
    private List<Part> parts = new ArrayList<>();
    public PartModel(long id, String name, PartType partType)
    {
        super(id);
        this.name=name;
        this.partType=partType;
    }

    public PartModel() {
        super(1);
    }

    public PartType getPartType() {
        return partType;
    }

    public String getName() {
        return name;
    }

    public void addPart(Part part)
    {
        parts.add(part);
    }
}
