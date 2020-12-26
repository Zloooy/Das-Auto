package com.example.client.controller;

import com.example.client.model.PartStatus;
import com.example.client.service.IPartStatusService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/part_statuses")
public class PartStatusController extends CRUDPageController<PartStatus, IPartStatusService> {
}
