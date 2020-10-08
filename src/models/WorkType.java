package models;

public class WorkType extends Identified<WorkType>{
    String name;
    int price;
    Id<MechanicSpecialization> mechanicSpecializationId;
    Id<PartType> partTypeId;

    public WorkType(Id<WorkType> id, String name, int price, Id<MechanicSpecialization> mechanicSpecializationId, Id<PartType> partTypeId) {
        super(id);
        this.name = name;
        this.price = price;
        this.mechanicSpecializationId = mechanicSpecializationId;
        this.partTypeId = partTypeId;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Id<MechanicSpecialization> getMechanicSpecializationId() {
        return mechanicSpecializationId;
    }

    public Id<PartType> getPartTypeId() {
        return partTypeId;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
