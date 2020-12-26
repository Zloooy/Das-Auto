package com.example.client.controller;

import com.example.client.model.PartModel;
import com.example.client.service.IPartModelService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/part_models")
public class PartModelController extends CRUDPageController<PartModel, IPartModelService> {
}
