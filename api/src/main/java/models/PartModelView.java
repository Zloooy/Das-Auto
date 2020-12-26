package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PartModelView extends IdentifiedView{
    private String name;
    private PartTypeView partType;
    private List<PartView> parts = new ArrayList<>();
    public PartModelView(long id, String name, PartTypeView partType)
    {
        super(id);
        this.name=name;
        this.partType=partType;
    }

    public PartTypeView getPartType() {
        return partType;
    }

    public String getName() {
        return name;
    }

    public void addPart(PartView part)
    {
        parts.add(part);
    }
}
