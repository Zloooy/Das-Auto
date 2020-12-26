package com.example.client.controller;

import com.example.client.model.OrderStatus;
import com.example.client.service.OrderStatusRestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order_statuses")
public class OrderStatusController extends CRUDPageController<OrderStatus, OrderStatusRestService>{
}
