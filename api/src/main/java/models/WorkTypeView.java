package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkTypeView extends IdentifiedView {
    private String name;
    private int price;

    private MechanicSpecializationView mechanicSpecialization;

    private PartTypeView partType;

    public WorkTypeView(long id, String name, int price, MechanicSpecializationView mechanicSpecialization, PartTypeView partType) {
        super(id);
        this.name = name;
        this.price = price;
        this.mechanicSpecialization = mechanicSpecialization;
        this.partType = partType;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public PartTypeView getPartType() {
        return partType;
    }

    public MechanicSpecializationView getMechanicSpecialization() {
        return mechanicSpecialization;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
