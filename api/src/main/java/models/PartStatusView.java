package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PartStatusView extends IdentifiedView {
    private String name;

    public PartStatusView(long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
