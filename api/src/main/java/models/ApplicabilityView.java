package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicabilityView extends IdentifiedView {

    private List<PartTypeView> applicableParts = new ArrayList<>();
    private CarModelView carModel;

    public ApplicabilityView(long id, CarModelView carModel) {
        super(id);
        this.carModel = carModel;
    }

    public CarModelView getCarModel() {
        return carModel;
    }
    public List<PartTypeView> getApplicableParts() {
        return applicableParts;
    }
}

