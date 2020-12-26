package com.example.client.controller;

import com.example.client.model.Applicability;
import com.example.client.service.IApplicabilityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/applicability")
public class ApplicabilityController extends CRUDController<Applicability, IApplicabilityService>
{

}