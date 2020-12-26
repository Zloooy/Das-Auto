package com.example.client.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="repair_schedule_rows")
public class RepairScheduleRow extends Identified {
    @Column(name="work_start")
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date workStart;
    @Column(name="work_end")
    @Temporal(value=TemporalType.TIMESTAMP)
    private Date workEnd;
    @ManyToMany
    @JoinTable(
            name="mechanics_schedule_rows_relation",
            joinColumns = @JoinColumn(name = "mechanic_id"),
            inverseJoinColumns = @JoinColumn(name = "schedule_id")
    )
    private List<Mechanic> mechanics;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="service_request_id")
    private ServiceRequest serviceRequest;

    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name="car_id")
    private Car car;

    public RepairScheduleRow(long id, Date workStart, Date workEnd, Car car) {
        super(id);
        this.workStart = workStart;
        this.workEnd = workEnd;
        this.car = car;
    }

    public RepairScheduleRow() {
        super(1);
    }

    public Date getWorkStart() {
        return workStart;
    }

    public Date getWorkEnd() {
        return workEnd;
    }

    public List<Mechanic> getMechanics()
    {
        return mechanics;
    }

    public ServiceRequest getServiceRequest() {
        return serviceRequest;
    }

    public void setServiceRequest(ServiceRequest serviceRequest) {
        this.serviceRequest = serviceRequest;
    }

    public Car getCar() {
        return car;
    }

}
