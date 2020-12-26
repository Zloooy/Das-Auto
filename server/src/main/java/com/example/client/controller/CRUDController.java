package com.example.client.controller;


import com.example.client.model.Identified;
import com.example.client.service.CRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public abstract class CRUDController<T extends Identified, S extends CRUDService<T>>{
    @Autowired
    S crudService;
    @PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
    T create(@RequestBody T value)
    {
        return crudService.create(value);
    }
    @GetMapping(value = "/{id}", produces = "application/json")
    T getById(@PathVariable(name="id") long id)
    {
        return crudService.getById(id);
    }
    @PutMapping(value = "/{id}", consumes = "application/json", produces = "application/json")
    boolean update(@PathVariable(name = "id") long id,@RequestBody T value)
    {
        return crudService.updateById(id, value);
    }
    @DeleteMapping(value = "/{id}", produces = "application/json")
    boolean delete(@PathVariable(name="id") long id)
    {
        return crudService.deleteById(id);
    }
}
