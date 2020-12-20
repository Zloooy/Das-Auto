package com.example.server.service;

import com.example.server.model.CarMark;
import com.example.server.repository.CarMarkRepository;
import org.springframework.stereotype.Service;

@Service
public class CarMarkRestService extends CRUDPageRestService<CarMark, CarMarkRepository>{
}
