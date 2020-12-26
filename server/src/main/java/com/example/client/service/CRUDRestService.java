package com.example.client.service;

import com.example.client.model.Identified;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public abstract class CRUDRestService<T extends Identified, R extends CrudRepository<T, Long>> implements CRUDService<T>{
    @Autowired
    R crudRepository;
    @Override
    public T create(T value) {
        if (crudRepository.existsById(value.getId()))
            value.resetId();
        Long id = crudRepository.save(value).getId();
        return crudRepository.findById(id).orElse(null);
    }

    @Override
    public boolean updateById(long id, T value) {
        if (!(crudRepository.existsById(id))) return false;
        value.setId(id);
        crudRepository.save(value);
        return true;
    }

    @Override
    public boolean deleteById(long id) {
        if (!crudRepository.existsById(id)) return false;
        crudRepository.deleteById(id);
        return true;
    }

    @Override
    public T getById(long id) {
        return crudRepository.findById(id).orElse(null);
    }
}
