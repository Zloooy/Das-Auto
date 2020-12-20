package com.example.server.repository;

import com.example.server.model.PaymentType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentTypeRepository extends PagingAndSortingRepository<PaymentType, Long> {
}
