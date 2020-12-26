package com.example.client.service;

import com.example.client.model.MechanicSpecialization;
import com.example.client.repository.MechanicSpecializationRepository;
import org.springframework.stereotype.Service;

@Service
public class MechanicSpecializationRestService extends CRUDPageRestService<MechanicSpecialization, MechanicSpecializationRepository> implements IMechanicSpecializationService{
}
