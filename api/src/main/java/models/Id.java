package models;

public class Id<T extends Identified<T>> {
    public Id(int value) {
        this.value = value;
    }

    private int value;
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public boolean equals(Object o)
    {
        if (o == this) return true;
        if (!(o instanceof Id<?>)) return false;
        Id<T> otherId = (Id<T>) o;
        return otherId.value == this.value;
    }
}
