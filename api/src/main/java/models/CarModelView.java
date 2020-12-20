package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CarModelView extends IdentifiedView {
    private String name;

    public CarModelView(long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

