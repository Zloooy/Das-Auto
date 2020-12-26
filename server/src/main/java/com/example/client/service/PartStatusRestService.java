package com.example.client.service;

import com.example.client.model.PartStatus;
import com.example.client.repository.PartStatusRepository;
import org.springframework.stereotype.Service;

@Service
public class PartStatusRestService extends CRUDPageRestService<PartStatus, PartStatusRepository> implements IPartStatusService{
}
