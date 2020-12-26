package com.example.client.controller;

import com.example.client.model.Cheque;
import com.example.client.service.IChequeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cheques")
public class ChequeController extends CRUDController<Cheque, IChequeService> {
}
