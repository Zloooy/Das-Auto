package com.example.server.service;

import com.example.server.model.PartStatus;
import com.example.server.repository.PartStatusRepository;
import org.springframework.stereotype.Service;

@Service
public class PartStatusRestService extends CRUDPageRestService<PartStatus, PartStatusRepository> implements IPartStatusService{
}
