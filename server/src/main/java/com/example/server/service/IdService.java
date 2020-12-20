package com.example.server.service;


import com.example.server.model.Identified;
import org.springframework.stereotype.Service;

@Service
public interface IdService<T extends Identified> {
    T getById(long id);
}
