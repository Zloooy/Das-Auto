package com.example.client.service;

import com.example.client.model.Applicability;
import com.example.client.repository.ApplicabilityRepository;
import org.springframework.stereotype.Service;

@Service
public class ApplicabilityRestService extends CRUDRestService<Applicability, ApplicabilityRepository> implements IApplicabilityService {
}
