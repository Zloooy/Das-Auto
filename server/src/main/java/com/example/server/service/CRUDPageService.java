package com.example.server.service;

import com.example.server.model.Identified;

public interface CRUDPageService<T extends Identified> extends CRUDService<T>, PageService<T>{
}
