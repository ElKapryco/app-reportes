package com.elkazykhe.app_report.infrastructure.repository;

import com.elkazykhe.app_report.infrastructure.models.Assignment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentRepository extends JpaRepository<Assignment, Integer> {
    
};
