package com.example.client.service;

import com.example.client.model.Part;
import com.example.client.repository.PartRepository;
import org.springframework.stereotype.Service;

@Service
public class PartRestService extends CRUDPageRestService<Part, PartRepository> implements IPartService{
}
