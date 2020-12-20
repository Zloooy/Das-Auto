package com.example.server.controller;

import com.example.server.model.CarModel;
import com.example.server.service.CarModelRestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car_models")
public class CarModelController extends CRUDController<CarModel, CarModelRestService> {
}
