package com.example.client.service;

import com.example.client.model.Order;
import com.example.client.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderRestService extends CRUDPageRestService<Order, OrderRepository> implements IOrderService {
}
