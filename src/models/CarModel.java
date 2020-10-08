package models;

public class CarModel extends Identified<CarModel>{
    private String name;

    public CarModel(Id<CarModel> id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

