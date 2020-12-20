package models;

import java.util.Date;

public class Part extends IdentifiedView {
    private long partStatus;
    private long partType;
    private Date arrivalDate;
    private int price;

    public Part(long id, long partStatus, long partType, Date arrivalDate, int price) {
        super(id);
        this.partStatus = partStatus;
        this.partType = partType;
        this.arrivalDate = arrivalDate;
        this.price = price;
    }

    public void setPartStatus(long partStatus) {
        this.partStatus = partStatus;
    }

    public long getPartStatus() {
        return partStatus;
    }

    public long getPartType() {
        return partType;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public int getPrice() {
        return price;
    }
}
