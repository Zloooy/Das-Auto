package services;

import models.IdentifiedView;

public interface IdService<T extends IdentifiedView> {
    T getById(long id);
}
