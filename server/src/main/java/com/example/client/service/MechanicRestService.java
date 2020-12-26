package com.example.client.service;

import com.example.client.model.Mechanic;
import com.example.client.repository.MechanicRepository;
import org.springframework.stereotype.Service;

@Service
public class MechanicRestService extends CRUDPageRestService<Mechanic, MechanicRepository> implements IMechanicService{
}
