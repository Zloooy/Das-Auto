package models;

public class Applicability extends Identified<Applicability>{
    private Id<CarMark> carMarkId;
    private Id<CarModel> carModelId;

    public Applicability(Id<Applicability> id, Id<CarMark> carMarkId, Id<CarModel> carModelId) {
        super(id);
        this.carMarkId = carMarkId;
        this.carModelId = carModelId;
    }

    public Id<CarMark> getCarMarkId() {
        return carMarkId;
    }

    public Id<CarModel> getCarModelId() {
        return carModelId;
    }
}
