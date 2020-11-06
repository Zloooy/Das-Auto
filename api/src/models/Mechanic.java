package models;

import java.util.ArrayList;

public class Mechanic extends Identified<Mechanic>{
    private String surname;
    private String nameMiddleName;
    private ArrayList<Id<MechanicSpecialization>> specializations;

    public String getSurname() {
        return surname;
    }

    public String getNameMiddleName() {
        return nameMiddleName;
    }

    public ArrayList<Id<MechanicSpecialization>> getSpecializations() {
        return specializations;
    }

    public Mechanic(Id<Mechanic> id, String surname, String nameMiddleName, ArrayList<Id<MechanicSpecialization>> specializations) {
        super(id);
        this.surname = surname;
        this.nameMiddleName = nameMiddleName;
        this.specializations = specializations;
    }

}
