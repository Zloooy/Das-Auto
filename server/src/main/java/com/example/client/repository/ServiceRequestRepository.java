package com.example.client.repository;

import com.example.client.model.ServiceRequest;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRequestRepository extends PagingAndSortingRepository<ServiceRequest, Long> {
}
