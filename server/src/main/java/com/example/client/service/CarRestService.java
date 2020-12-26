package com.example.client.service;

import com.example.client.model.Car;
import com.example.client.repository.CarRepository;
import org.springframework.stereotype.Service;

@Service
public class CarRestService extends CRUDPageRestService<Car, CarRepository> implements ICarService{
}
