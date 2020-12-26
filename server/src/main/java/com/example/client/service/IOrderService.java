package com.example.client.service;

import com.example.client.model.Order;
import org.springframework.stereotype.Service;

@Service
public interface IOrderService extends CRUDPageService<Order> {
}
