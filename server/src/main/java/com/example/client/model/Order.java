package com.example.client.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="orders")
public class Order extends Identified {
    @Column(name="start_time")
    @Temporal(value = TemporalType.DATE)
    private Date startTime;
    @Column(name="end_time")
    @Temporal(value = TemporalType.DATE)
    private Date endTime = new Date(0);
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="order_status_id")
    private OrderStatus orderStatus;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="client_id")
    private User client;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "car_id")
    private Car car;
    @OneToMany(mappedBy="order")
    private List<ServiceRequest> serviceRequests = new ArrayList<>();

    public Order(long id, Date startTime, OrderStatus orderStatus, User client, Car car) {
        super(id);
        this.startTime = startTime;
        this.orderStatus = orderStatus;
        this.client = client;
        this.car = car;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public User getClient() {
        return client;
    }

    public Car getCar() {
        return car;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
