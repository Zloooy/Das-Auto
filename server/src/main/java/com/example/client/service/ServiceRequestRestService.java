package com.example.client.service;

import com.example.client.model.ServiceRequest;
import com.example.client.repository.ServiceRequestRepository;
import org.springframework.stereotype.Service;

@Service
public class ServiceRequestRestService extends CRUDPageRestService<ServiceRequest, ServiceRequestRepository> implements IServiceRequestService {
}
