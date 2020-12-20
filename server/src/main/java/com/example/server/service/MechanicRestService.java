package com.example.server.service;

import com.example.server.model.Mechanic;
import com.example.server.repository.MechanicRepository;
import org.springframework.stereotype.Service;

@Service
public class MechanicRestService extends CRUDPageRestService<Mechanic, MechanicRepository> implements IMechanicService{
}
