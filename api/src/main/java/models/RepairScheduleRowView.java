package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RepairScheduleRowView extends IdentifiedView {
    private Date workStart;
    private Date workEnd;

    private List<MechanicView> mechanics;
    private ServiceRequestView serviceRequest;

    private CarView car;

    public RepairScheduleRowView(long id, Date workStart, Date workEnd, CarView car) {
        super(id);
        this.workStart = workStart;
        this.workEnd = workEnd;
        this.car = car;
    }
    public Date getWorkStart() {
        return workStart;
    }

    public Date getWorkEnd() {
        return workEnd;
    }


    public List<MechanicView> getMechanics() {
        return mechanics;
    }

    public void setMechanics(List<MechanicView> mechanics) {
        this.mechanics = mechanics;
    }

    public ServiceRequestView getServiceRequest() {
        return serviceRequest;
    }

    public void setServiceRequest(ServiceRequestView serviceRequest) {
        this.serviceRequest = serviceRequest;
    }

    public CarView getCar() {
        return car;
    }

}
