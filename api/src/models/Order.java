package models;

import java.util.Date;

public class Order  extends Identified<Order>{
    private Date startTime;
    private Date endTime = new Date(0);
    private Id<OrderStatus> orderStatusId;
    private Id<User> clientId;
    private Id<Car> carId;

    public Order(Id<Order> id, Date startTime, Id<OrderStatus> orderStatusId, Id<User> clientId, Id<Car> carId) {
        super(id);
        this.startTime = startTime;
        this.orderStatusId = orderStatusId;
        this.clientId = clientId;
        this.carId = carId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Id<OrderStatus> getOrderStatusId() {
        return orderStatusId;
    }

    public Id<User> getClientId() {
        return clientId;
    }

    public Id<Car> getCarId() {
        return carId;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setOrderStatusId(Id<OrderStatus> orderStatusId) {
        this.orderStatusId = orderStatusId;
    }
}
