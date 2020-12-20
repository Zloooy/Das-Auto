package models;

public class ServiceRequest extends IdentifiedView {
    private long orderId;
    private long partTypeId;
    private long workTypeId;
    private long partId;
    private long repairScheduleRowId;

    public ServiceRequest(long id, long orderId, long partTypeId, long workTypeId, long partId, long repairScheduleRowId) {
        super(id);
        this.orderId = orderId;
        this.partTypeId = partTypeId;
        this.workTypeId = workTypeId;
        this.partId = partId;
        this.repairScheduleRowId = repairScheduleRowId;
    }

    public long getOrderId() {
        return orderId;
    }

    public long getPartTypeId() {
        return partTypeId;
    }

    public long getWorkTypeId() {
        return workTypeId;
    }

    public long getPartId() {
        return partId;
    }

    public long getRepairScheduleRowId() {
        return repairScheduleRowId;
    }

}
