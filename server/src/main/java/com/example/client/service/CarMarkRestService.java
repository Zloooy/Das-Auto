package com.example.client.service;

import com.example.client.model.CarMark;
import com.example.client.repository.CarMarkRepository;
import org.springframework.stereotype.Service;

@Service
public class CarMarkRestService extends CRUDPageRestService<CarMark, CarMarkRepository>{
}
