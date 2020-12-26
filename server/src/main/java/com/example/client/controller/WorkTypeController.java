package com.example.client.controller;

import com.example.client.model.WorkType;
import com.example.client.service.IWorkTypeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/work_types")
public class WorkTypeController extends CRUDPageController<WorkType, IWorkTypeService> {
}
