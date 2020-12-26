package com.example.client.controller;

import com.example.client.model.Part;
import com.example.client.service.IPartService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parts")
public class PartController extends CRUDPageController<Part, IPartService> {
}
