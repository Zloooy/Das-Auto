package com.example.client.controller;

import com.example.client.model.MechanicSpecialization;
import com.example.client.service.IMechanicSpecializationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mechanic_specializations")
public class MechanicSpecializationController extends CRUDPageController<MechanicSpecialization, IMechanicSpecializationService>{

}
