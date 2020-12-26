package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PartView extends IdentifiedView {
    private PartStatusView partStatus;
    private PartModelView partModel;
    private Date arrivalDate;
    private int price;

    private ServiceRequestView serviceRequest;

    public PartView(long id, PartStatusView partStatus, PartModelView partModel, Date arrivalDate, int price) {
        super(id);
        this.partStatus = partStatus;
        this.partModel = partModel;
        this.arrivalDate = arrivalDate;
        this.price = price;
    }

    public void setPartStatus(PartStatusView partStatus) {
        this.partStatus = partStatus;
    }

    public PartStatusView getPartStatus() {
        return partStatus;
    }

    public PartModelView getPartModel() {
        return partModel;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public int getPrice() {
        return price;
    }
    public ServiceRequestView getServiceRequest() {
        return serviceRequest;
    }

    public void setServiceRequest(ServiceRequestView serviceRequest) {
        this.serviceRequest = serviceRequest;
    }
}
