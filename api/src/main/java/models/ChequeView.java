package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChequeView extends IdentifiedView {
    boolean paid;
    int sum;
    PaymentTypeView paymentType;

    public ChequeView(long id, boolean paid, int sum, PaymentTypeView paymentType) {
        super(id);
        this.paid = paid;
        this.sum = sum;
        this.paymentType = paymentType;
    }

    public boolean isPaid() {
        return paid;
    }

    public int getSum() {
        return sum;
    }

    public PaymentTypeView getPaymentType() {
        return paymentType;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public void setPaymentType(PaymentTypeView paymentType) {
        this.paymentType = paymentType;
    }
}
