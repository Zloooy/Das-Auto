package com.example.server.service;

import com.example.server.model.CarModel;
import com.example.server.repository.CarModelRepository;
import org.springframework.stereotype.Service;

@Service
public class CarModelRestService extends CRUDRestService<CarModel, CarModelRepository> implements ICarModelService{
}
