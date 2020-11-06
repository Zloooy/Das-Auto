package models;

import java.util.Date;

public class Part extends Identified<Part>{
    private Id<PartStatus> partStatus;
    private Id<PartType> partType;
    private Date arrivalDate;
    private int price;

    public Part(Id<Part> id, Id<PartStatus> partStatus, Id<PartType> partType, Date arrivalDate, int price) {
        super(id);
        this.partStatus = partStatus;
        this.partType = partType;
        this.arrivalDate = arrivalDate;
        this.price = price;
    }

    public void setPartStatus(Id<PartStatus> partStatus) {
        this.partStatus = partStatus;
    }

    public Id<PartStatus> getPartStatus() {
        return partStatus;
    }

    public Id<PartType> getPartType() {
        return partType;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public int getPrice() {
        return price;
    }
}
