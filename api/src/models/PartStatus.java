package models;

public class PartStatus extends Identified<PartStatus>{
    private String name;

    public PartStatus(Id<PartStatus> id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
