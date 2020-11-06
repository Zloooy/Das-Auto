package models;

public class CarMark extends Identified<CarMark>{
    private String name;

    public CarMark(Id<CarMark> id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
