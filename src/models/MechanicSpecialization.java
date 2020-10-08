package models;

public class MechanicSpecialization extends Identified<MechanicSpecialization>{
    private String name;

    public MechanicSpecialization(Id<MechanicSpecialization> id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
