package com.example.client.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "part_types")
public class PartType extends Identified {
        @Column(name = "name")
        private String name;

        @ManyToMany(mappedBy = "applicableParts")
        private List<Applicability> applicabilities = new ArrayList<>();
        @ManyToMany(mappedBy = "partTypes", fetch = FetchType.LAZY)
        List<WorkType> workTypes;

    @OneToMany(mappedBy="partType")
        List<PartModel> partModels = new ArrayList<>();

        public PartType(long id, String name) {
            super(id);
            this.name = name;
        }

    public PartType() {
        super(1);
    }

    public String getName() {
            return name;
        }

    public List<Applicability> getApplicabilities() {
            return applicabilities;
        }

    public List<PartModel> getPartModels() {
        return partModels;
    }
}
