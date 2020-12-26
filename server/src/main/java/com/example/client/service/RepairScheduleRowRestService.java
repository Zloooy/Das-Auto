package com.example.client.service;

import com.example.client.model.RepairScheduleRow;
import com.example.client.repository.RepairScheduleRowRepository;
import org.springframework.stereotype.Service;

@Service
public class RepairScheduleRowRestService extends CRUDRestService<RepairScheduleRow, RepairScheduleRowRepository> implements IRepairScheduleRowService{
}
