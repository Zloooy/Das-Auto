package models;

public class Car extends Identified<Car>{
    private Id<CarModel> modelId;
    private Vin vin;

    Car(Id<Car> id, Id<CarModel> modelId, Vin vin) {
        super(id);
        this.modelId=modelId;
        this.vin=vin;
    }

    public Vin getVin() {
        return vin;
    }

    public Id<CarModel> getModelId() {
        return modelId;
    }
}
