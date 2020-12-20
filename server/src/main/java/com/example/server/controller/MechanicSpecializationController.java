package com.example.server.controller;

import com.example.server.model.MechanicSpecialization;
import com.example.server.service.IMechanicSpecializationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mechanic_specializations")
public class MechanicSpecializationController extends CRUDPageController<MechanicSpecialization, IMechanicSpecializationService>{

}
