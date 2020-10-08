package models;

public class PaymentType extends Identified{
    String name;

    public PaymentType(Id id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
