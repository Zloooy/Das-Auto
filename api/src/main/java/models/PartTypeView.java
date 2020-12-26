package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PartTypeView extends IdentifiedView {
    private String name;
    private ApplicabilityView applicability;

    private List<PartModelView> partModels = new ArrayList<>();

    public PartTypeView(long id, String name, ApplicabilityView applicability) {
        super(id);
        this.name = name;
        this.applicability = applicability;
    }

    public String getName() {
        return name;
    }

    public ApplicabilityView getApplicability() {
        return applicability;
    }
    public List<PartModelView> getPartModels() {
        return partModels;
    }

}
