package com.example.server.service;

import com.example.server.model.Identified;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public abstract class CRUDPageRestService<T extends Identified, R extends PagingAndSortingRepository<T, Long>> extends CRUDRestService<T, R> implements PageService<T>{
    @Override
    public Page<T> getPage(Pageable page) {
        return crudRepository.findAll(page);
    }
}
