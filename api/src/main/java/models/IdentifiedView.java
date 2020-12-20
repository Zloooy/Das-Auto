package models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IdentifiedView {

    private Long id;
    IdentifiedView(long id)
    {
        this.id=id;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public boolean equals(Object o)
    {
        if (o==this) return true;
        if (!(o instanceof IdentifiedView)) return false;
        IdentifiedView other = (IdentifiedView)o;
        return this.id == other.id;
    }
}
