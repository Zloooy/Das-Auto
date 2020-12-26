package com.example.client.controller;

import com.example.client.model.PartType;
import com.example.client.service.IPartTypeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/part_types")
public class PartTypeController extends CRUDPageController<PartType, IPartTypeService> {
}
