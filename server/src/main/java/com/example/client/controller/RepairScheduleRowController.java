package com.example.client.controller;

import com.example.client.model.RepairScheduleRow;
import com.example.client.service.IRepairScheduleRowService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/repair_schedule_rows")
public class RepairScheduleRowController extends CRUDController<RepairScheduleRow, IRepairScheduleRowService>{
}
