package models;

public class WorkType extends IdentifiedView {
    String name;
    int price;
    long mechanicSpecializationId;
    long partTypeId;

    public WorkType(long id, String name, int price, long mechanicSpecializationId, long partTypeId) {
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

    public long getMechanicSpecializationId() {
        return mechanicSpecializationId;
    }

    public long getPartTypeId() {
        return partTypeId;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
