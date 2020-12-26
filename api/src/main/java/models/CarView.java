package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CarView extends IdentifiedView {
    private CarModelView model;
    private String vin;

    CarView(long id, CarModelView model, String vin) {
        super(id);
        this.model = model;
        this.vin=vin;
    }

    public String getVin() {
        return vin;
    }

    public CarModelView getModel() {
        return model;
    }
}
