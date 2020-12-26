package com.example.client.service;

import com.example.client.model.Identified;

public interface CRUDPageService<T extends Identified> extends CRUDService<T>, PageService<T>{
}
