package models;

public class Car extends IdentifiedView {
    private long modelId;
    private Vin vin;

    Car(long id, long modelId, Vin vin) {
        super(id);
        this.modelId=modelId;
        this.vin=vin;
    }

    public Vin getVin() {
        return vin;
    }

    public long getModelId() {
        return modelId;
    }
}
