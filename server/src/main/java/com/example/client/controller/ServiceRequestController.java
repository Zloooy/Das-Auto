package com.example.client.controller;

import com.example.client.model.ServiceRequest;
import com.example.client.service.IServiceRequestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service_requests")
public class ServiceRequestController extends CRUDPageController<ServiceRequest, IServiceRequestService> {
}
