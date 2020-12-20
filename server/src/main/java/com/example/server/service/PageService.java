package com.example.server.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface PageService<T>{
    Page<T> getPage(Pageable page);
}
