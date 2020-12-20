package models;

import java.util.Date;

public class Order  extends IdentifiedView {
    private Date startTime;
    private Date endTime = new Date(0);
    private long orderStatusId;
    private long clientId;
    private long carId;

    public Order(long id, Date startTime, long orderStatusId, long clientId, long carId) {
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

    public long getOrderStatusId() {
        return orderStatusId;
    }

    public long getClientId() {
        return clientId;
    }

    public long getCarId() {
        return carId;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setOrderStatusId(long orderStatusId) {
        this.orderStatusId = orderStatusId;
    }
}
