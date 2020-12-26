package com.example.client.model;

import javax.persistence.*;

@Entity
@Table(name="cheques")
public class Cheque extends Identified {
    @Column(name="paid")
    boolean paid;
    @Column(name = "sum")
    int sum;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="payment_type_id")
    PaymentType paymentType;

    public Cheque(long id, boolean paid, int sum, PaymentType paymentType) {
        super(id);
        this.paid = paid;
        this.sum = sum;
        this.paymentType = paymentType;
    }

    public Cheque() {
        super(1);
    }

    public boolean isPaid() {
        return paid;
    }

    public int getSum() {
        return sum;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
}
