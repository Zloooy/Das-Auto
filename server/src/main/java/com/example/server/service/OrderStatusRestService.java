package com.example.server.service;

import com.example.server.model.OrderStatus;
import com.example.server.repository.OrderStatusRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderStatusRestService extends CRUDPageRestService<OrderStatus, OrderStatusRepository> implements IOrderStatusService{
}
