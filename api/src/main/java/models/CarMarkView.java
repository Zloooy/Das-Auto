package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CarMarkView extends IdentifiedView {
    private String name;
    private List<CarModelView> models;

    public CarMarkView(long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
