package com.example.client.service;


import com.example.client.model.Identified;
import org.springframework.stereotype.Service;

@Service
public interface IdService<T extends Identified> {
    T getById(long id);
}
