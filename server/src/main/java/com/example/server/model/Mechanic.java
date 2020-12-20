package com.example.server.model;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name="mechanics")
public class Mechanic extends Identified {
    @Column(name = "surname")
    private String surname;
    @Column(name = "name_middle_name")
    private String nameMiddleName;
    @ManyToMany(mappedBy = "mechanics", fetch = FetchType.LAZY)
    private List<MechanicSpecialization> specializations;
    @ManyToMany(mappedBy = "mechanics", fetch = FetchType.LAZY)
    private List<RepairScheduleRow> schedule_rows;

    public Mechanic() {
        super(1);
    }

    public String getSurname() {
        return surname;
    }

    public String getNameMiddleName() {
        return nameMiddleName;
    }

    public Mechanic(long id, String surname, String nameMiddleName) {
        super(id);
        this.surname = surname;
        this.nameMiddleName = nameMiddleName;
    }

    public void addSpecialization(MechanicSpecialization specialization) {
        specializations.add(specialization);
    }

    public void removeSpecialization(final MechanicSpecialization specialization)
    {
        specializations = specializations.stream().filter((spec -> !spec.equals(specialization))).collect(Collectors.toList());
    }


    public List<MechanicSpecialization> getSpecializations() {
        return specializations;
    }

}
