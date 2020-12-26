package com.example.client.service;

import com.example.client.model.CarModel;
import com.example.client.repository.CarModelRepository;
import org.springframework.stereotype.Service;

@Service
public class CarModelRestService extends CRUDRestService<CarModel, CarModelRepository> implements ICarModelService{
}
