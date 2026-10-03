package com.elkazykhe.app_report.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elkazykhe.app_report.infrastructure.models.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Integer> {
    
}
