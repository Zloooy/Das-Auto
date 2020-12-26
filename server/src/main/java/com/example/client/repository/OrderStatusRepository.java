package com.example.client.repository;

import com.example.client.model.OrderStatus;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderStatusRepository extends PagingAndSortingRepository<OrderStatus, Long> {
}
