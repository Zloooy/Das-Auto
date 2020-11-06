package models;

public class Identified<T extends Identified<T>> {
    private Id<T> id;
    Identified(Id<T> id)
    {
        this.id=id;
    }
    public Id<T> getId() {
        return id;
    }

    public void setId(Id<T> id) {
        this.id = id;
    }
    public boolean equals(Object o)
    {
        if (o==this) return true;
        if (!(o instanceof Identified)) return false;
        Identified<T> other = (Identified<T>)o;
        return this.id == other.id;
    }
}
