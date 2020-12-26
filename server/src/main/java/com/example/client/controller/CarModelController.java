package com.example.client.controller;

import com.example.client.model.CarModel;
import com.example.client.service.CarModelRestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car_models")
public class CarModelController extends CRUDController<CarModel, CarModelRestService> {
}
