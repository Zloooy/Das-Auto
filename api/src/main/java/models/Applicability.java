package models;

public class Applicability extends IdentifiedView {
    private long carMarkId;
    private long carModelId;

    public Applicability(long id, long carMarkId, long carModelId) {
        super(id);
        this.carMarkId = carMarkId;
        this.carModelId = carModelId;
    }

    public long getCarMarkId() {
        return carMarkId;
    }

    public long getCarModelId() {
        return carModelId;
    }
}
