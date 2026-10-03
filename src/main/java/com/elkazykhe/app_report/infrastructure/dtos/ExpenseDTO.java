package com.elkazykhe.app_report.infrastructure.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseDTO {
    private Integer expenseId;
    private Integer vehicleId;
    private LocalDate expenseDate;
    private String expenseType;
    private String description;
    private BigDecimal amount;
    private String paymentMethod;
    private String documentNumber;
    private String notes;
    private LocalDateTime createdAt;
}
