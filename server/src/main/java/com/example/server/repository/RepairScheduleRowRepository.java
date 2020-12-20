package com.example.server.repository;

import com.example.server.model.RepairScheduleRow;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RepairScheduleRowRepository extends PagingAndSortingRepository<RepairScheduleRow, Long> {
}
