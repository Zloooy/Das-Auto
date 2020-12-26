package com.example.client.service;

import com.example.client.model.OrderStatus;
import org.springframework.stereotype.Service;

@Service
public interface IOrderStatusService extends CRUDPageService<OrderStatus> {
}
