package com.example.server.service;

import com.example.server.model.MechanicSpecialization;
import com.example.server.repository.MechanicSpecializationRepository;
import org.springframework.stereotype.Service;

@Service
public class MechanicSpecializationRestService extends CRUDPageRestService<MechanicSpecialization, MechanicSpecializationRepository> implements IMechanicSpecializationService{
}
