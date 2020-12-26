package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceRequestView extends IdentifiedView {
    private OrderView order;
    private List<PartTypeView> partTypes;
    private WorkTypeView workType;
    private List<PartView> parts;
    private RepairScheduleRowView repairScheduleRow;

    public ServiceRequestView(long id, OrderView order, List<PartTypeView> partTypes, WorkTypeView workType, List<PartView> parts, RepairScheduleRowView repairScheduleRow) {
        super(id);
        this.order = order;
        this.partTypes = partTypes;
        this.workType = workType;
        this.parts = parts;
        this.repairScheduleRow = repairScheduleRow;
    }

    public OrderView getOrder() {
        return order;
    }

    public List<PartTypeView> getPartTypes() {
        return partTypes;
    }

    public WorkTypeView getWorkType() {
        return workType;
    }

    public List<PartView> getParts() {
        return parts;
    }

    public RepairScheduleRowView getRepairScheduleRow() {
        return repairScheduleRow;
    }

}
