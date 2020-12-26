package com.example.client.service;

import com.example.client.model.OrderStatus;
import com.example.client.repository.OrderStatusRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderStatusRestService extends CRUDPageRestService<OrderStatus, OrderStatusRepository> implements IOrderStatusService{
}
