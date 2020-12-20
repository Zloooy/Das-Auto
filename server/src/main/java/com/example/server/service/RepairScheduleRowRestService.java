package com.example.server.service;

import com.example.server.model.RepairScheduleRow;
import com.example.server.repository.RepairScheduleRowRepository;
import org.springframework.stereotype.Service;

@Service
public class RepairScheduleRowRestService extends CRUDRestService<RepairScheduleRow, RepairScheduleRowRepository> implements IRepairScheduleRowService{
}
