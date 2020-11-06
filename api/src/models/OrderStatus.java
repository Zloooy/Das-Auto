package models;

public class OrderStatus extends Identified<OrderStatus>{
    private String name;

    public OrderStatus(Id<OrderStatus> id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
