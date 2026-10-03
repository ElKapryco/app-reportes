package com.elkazykhe.app_report.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elkazykhe.app_report.infrastructure.models.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
    
}
