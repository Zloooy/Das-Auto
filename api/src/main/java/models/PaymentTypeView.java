package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentTypeView extends IdentifiedView {
    String name;

    public PaymentTypeView(long id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
