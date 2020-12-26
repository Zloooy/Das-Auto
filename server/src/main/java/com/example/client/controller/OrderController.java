package com.example.client.controller;

import com.example.client.model.Order;
import com.example.client.service.IOrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController extends CRUDPageController<Order, IOrderService> {
}
