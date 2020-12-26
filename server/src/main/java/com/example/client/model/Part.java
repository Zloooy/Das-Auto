package com.example.client.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="parts")
public class Part extends Identified {
    @ManyToOne
    @JoinColumn(name="part_status_id")
    private PartStatus partStatus;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="part_model_id")
    private PartModel partModel;
    @Column(name="arrival_date")
    @Temporal(value = TemporalType.DATE)
    private Date arrivalDate;
    @Column(name="price")
    private int price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="service_request_id")
    private ServiceRequest serviceRequest;

    public Part(long id, PartStatus partStatus, PartModel partModel, Date arrivalDate, int price) {
        super(id);
        this.partStatus = partStatus;
        this.partModel = partModel;
        this.arrivalDate = arrivalDate;
        this.price = price;
    }

    public Part() {
        super(1);
    }

    public void setPartStatus(PartStatus partStatus) {
        this.partStatus = partStatus;
    }

    public PartStatus getPartStatus() {
        return partStatus;
    }

    public PartModel getPartModel() {
        return partModel;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public int getPrice() {
        return price;
    }

    public ServiceRequest getServiceRequest() {
        return serviceRequest;
    }

    public void setServiceRequest(ServiceRequest serviceRequest) {
        this.serviceRequest = serviceRequest;
    }
}
