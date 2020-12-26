package com.example.client.repository;

import com.example.client.model.PaymentType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentTypeRepository extends PagingAndSortingRepository<PaymentType, Long> {
}
