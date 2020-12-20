package com.example.server.controller;

import com.example.server.model.RepairScheduleRow;
import com.example.server.service.IRepairScheduleRowService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/repair_schedule_rows")
public class RepairScheduleRowController extends CRUDController<RepairScheduleRow, IRepairScheduleRowService>{
}
