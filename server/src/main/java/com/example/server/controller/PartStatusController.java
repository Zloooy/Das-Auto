package com.example.server.controller;

import com.example.server.model.PartStatus;
import com.example.server.service.IPartStatusService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/part_statuses")
public class PartStatusController extends CRUDPageController<PartStatus, IPartStatusService> {
}
