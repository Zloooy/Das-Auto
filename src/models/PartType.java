package models;

import java.awt.*;

public class PartType extends Identified<PartType>{
    private String name;
    private Color color;
    private String carMark;
    private String carModel;

    public PartType(Id<PartType> id, String name, Color color, String carMark, String carModel) {
        super(id);
        this.name = name;
        this.color = color;
        this.carMark = carMark;
        this.carModel = carModel;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public String getCarMark() {
        return carMark;
    }

    public String getCarModel() {
        return carModel;
    }
}
