package com.example.client.service;

import com.example.client.model.PartModel;
import com.example.client.repository.PartModelRepository;
import org.springframework.stereotype.Service;

@Service
public class PartModelRestService extends CRUDPageRestService<PartModel, PartModelRepository> implements IPartModelService{
}
