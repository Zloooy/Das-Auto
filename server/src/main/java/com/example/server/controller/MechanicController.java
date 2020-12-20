package com.example.server.controller;

import com.example.server.model.Mechanic;
import com.example.server.service.IMechanicService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mechanics")
public class MechanicController extends CRUDPageController<Mechanic, IMechanicService> {
}
