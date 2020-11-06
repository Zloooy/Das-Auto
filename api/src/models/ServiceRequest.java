package models;

public class ServiceRequest extends Identified<ServiceRequest>{
    private Id<Order> orderId;
    private Id<PartType> partTypeId;
    private Id<WorkType> workTypeId;
    private Id<Part> partId;
    private Id<RepairScheduleRow> repairScheduleRowId;

    public ServiceRequest(Id<ServiceRequest> id, Id<Order> orderId, Id<PartType> partTypeId, Id<WorkType> workTypeId, Id<Part> partId, Id<RepairScheduleRow> repairScheduleRowId) {
        super(id);
        this.orderId = orderId;
        this.partTypeId = partTypeId;
        this.workTypeId = workTypeId;
        this.partId = partId;
        this.repairScheduleRowId = repairScheduleRowId;
    }

    public Id<Order> getOrderId() {
        return orderId;
    }

    public Id<PartType> getPartTypeId() {
        return partTypeId;
    }

    public Id<WorkType> getWorkTypeId() {
        return workTypeId;
    }

    public Id<Part> getPartId() {
        return partId;
    }

    public Id<RepairScheduleRow> getRepairScheduleRowId() {
        return repairScheduleRowId;
    }

}
