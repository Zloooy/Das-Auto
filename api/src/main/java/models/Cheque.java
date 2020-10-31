package models;

public class Cheque extends Identified<Cheque>{
    boolean paid;
    int sum;
    Id<PaymentType> paymentTypeId;

    public Cheque(Id<Cheque> id, boolean paid, int sum, Id<PaymentType> paymentTypeId) {
        super(id);
        this.paid = paid;
        this.sum = sum;
        this.paymentTypeId = paymentTypeId;
    }

    public boolean isPaid() {
        return paid;
    }

    public int getSum() {
        return sum;
    }

    public Id<PaymentType> getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public void setPaymentTypeId(Id<PaymentType> paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }
}
