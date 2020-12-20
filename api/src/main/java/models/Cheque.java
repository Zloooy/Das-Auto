package models;

public class Cheque extends IdentifiedView {
    boolean paid;
    int sum;
    long paymentTypeId;

    public Cheque(long id, boolean paid, int sum, long paymentTypeId) {
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

    public long getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public void setPaymentTypeId(long paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }
}
