package com.example.client.controller;

import com.example.client.model.Mechanic;
import com.example.client.service.IMechanicService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mechanics")
public class MechanicController extends CRUDPageController<Mechanic, IMechanicService> {
}
