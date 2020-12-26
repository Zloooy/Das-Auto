package com.example.client.service;

import com.example.client.model.PartType;
import com.example.client.repository.PartTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class PartTypeRestService extends CRUDPageRestService<PartType, PartTypeRepository> implements IPartTypeService {
}
