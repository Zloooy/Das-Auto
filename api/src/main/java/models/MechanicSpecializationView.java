package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MechanicSpecializationView extends IdentifiedView {
    private String name;

    private List<MechanicView> mechanics = new ArrayList<>();

    public MechanicSpecializationView(long id, String name) {
        super(id);
        this.name = name;
    }

    public List<MechanicView> getMechanics() {
        return mechanics;
    }
    public String getName() {
        return name;
    }
}
