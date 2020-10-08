package models;

public class PaymentType extends Identified<PaymentType>{
    String name;

    public PaymentType(Id<PaymentType> id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
