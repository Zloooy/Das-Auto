package com.example.client.service;

import com.example.client.model.WorkType;
import com.example.client.repository.WorkTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class WorkTypeRestService extends CRUDPageRestService<WorkType, WorkTypeRepository> implements IWorkTypeService {
}
