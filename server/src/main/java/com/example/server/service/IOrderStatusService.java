package com.example.server.service;

import com.example.server.model.OrderStatus;
import org.springframework.stereotype.Service;

@Service
public interface IOrderStatusService extends CRUDPageService<OrderStatus> {
}
