package models;

public class PartType extends IdentifiedView {
    private String name;
    private long applicabilityId;

    public PartType(long id, String name, long applicabilityId) {
        super(id);
        this.name = name;
        this.applicabilityId = applicabilityId;
    }

    public String getName() {
        return name;
    }
    public long getApplicabilityId() {
        return applicabilityId;
    }

}
