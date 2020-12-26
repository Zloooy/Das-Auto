package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderView extends IdentifiedView {
    private Date startTime;
    private Date endTime = new Date(0);
    private OrderStatusView orderStatus;
    private UserView client;
    private CarView car;
    private List<ServiceRequestView> serviceRequests = new ArrayList<>();

    public OrderView(long id, Date startTime, OrderStatusView orderStatus, UserView client, CarView car) {
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

    public OrderStatusView getOrderStatus() {
        return orderStatus;
    }

    public UserView getClient() {
        return client;
    }

    public CarView getCar() {
        return car;
    }

    public List<ServiceRequestView> getServiceRequests() {
        return serviceRequests;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setOrderStatus(OrderStatusView orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void addServiceRequest(ServiceRequestView request)
    {
        serviceRequests.add(request);
    }
}
