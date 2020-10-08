package models;

public class PartType extends Identified<PartType>{
    private String name;
    private Id<Applicability> applicabilityId;

    public PartType(Id<PartType> id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Id<Applicability> getApplicabilityId() {
        return applicabilityId;
    }

}
