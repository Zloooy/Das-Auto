package com.example.client.controller;

import com.example.client.model.Identified;
import com.example.client.service.CRUDPageService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public abstract class CRUDPageController<T extends Identified, S extends CRUDPageService<T>> extends CRUDController<T, S>{
    @GetMapping("/")
    public Page<T> getPage(Pageable pageble)
    {
        return crudService.getPage(pageble);
    }
}
