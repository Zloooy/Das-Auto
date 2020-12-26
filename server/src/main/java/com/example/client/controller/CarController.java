package com.example.client.controller;

import com.example.client.model.Car;
import com.example.client.service.ICarService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController extends CRUDPageController<Car, ICarService> {
}
