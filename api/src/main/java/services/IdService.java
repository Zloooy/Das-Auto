package services;

import models.Id;
import models.Identified;

public interface IdService<T extends Identified<T>> {
    public T getById(Id<T> id);
}
