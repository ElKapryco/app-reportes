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
public class DriverLogDTO {
    private Integer logId;
    private Integer driverId;
    private Integer vehicleId;
    private LocalDate logDate;
    private Integer startOdometer;
    private Integer endOdometer;
    private Integer totalTrips;
    private BigDecimal grossIncome;
    private BigDecimal fuelExpense;
    private BigDecimal maintenanceExpense;
    private BigDecimal otherExpenses;
    private BigDecimal netIncome;
    private Boolean rentalPaid;
    private String notes;
    private LocalDateTime createdAt;
}
