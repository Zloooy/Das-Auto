package com.example.client.service;

import com.example.client.model.Identified;

public interface CRUDService<T extends Identified> extends IdService<T>{
    T create(T value);
    boolean updateById(long id, T value);
    boolean deleteById(long id);
}
