package com.example.server.service;

import com.example.server.model.Identified;

public interface CRUDService<T extends Identified> extends IdService<T>{
    T create(T value);
    boolean updateById(long id, T value);
    boolean deleteById(long id);
}
