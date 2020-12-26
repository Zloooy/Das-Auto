package com.example.client.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="service_requests")
public class ServiceRequest extends Identified {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orderId")
    private Order order;
    @ManyToMany
    @JoinTable(name = "service_request_part_type_relation",
    joinColumns = @JoinColumn(name = "service_request_id"),
    inverseJoinColumns = @JoinColumn(name="part_type_id"))
    private List<PartType> partTypes;
    @ManyToOne
    @JoinColumn(name="work_type_id")
    private WorkType workType;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Part> parts;
    @OneToMany(cascade = CascadeType.ALL)
    private List<RepairScheduleRow> repairScheduleRows;

    public ServiceRequest(long id, Order order, List<PartType> partTypes, WorkType workType, List<Part> parts, List<RepairScheduleRow> repairScheduleRows) {
        super(id);
        this.order = order;
        this.partTypes = partTypes;
        this.workType = workType;
        this.parts = parts;
        this.repairScheduleRows = repairScheduleRows;
    }

    public Order getOrder() {
        return order;
    }

    public List<PartType> getPartTypes() {
        return partTypes;
    }

    public WorkType getWorkType() {
        return workType;
    }

    public List<Part> getParts() {
        return parts;
    }

    public List<RepairScheduleRow> getRepairScheduleRows() {
        return repairScheduleRows;
    }

}
