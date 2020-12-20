package com.example.server.controller;

import com.example.server.model.OrderStatus;
import com.example.server.service.OrderStatusRestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order_statuses")
public class OrderStatusController extends CRUDPageController<OrderStatus, OrderStatusRestService>{
}
