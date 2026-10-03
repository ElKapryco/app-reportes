package com.elkazykhe.app_report.infrastructure.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "drivers_logs")
@Builder
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class DriverLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_id")
    private Integer logId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "driver_id", nullable = false)
    private Driver driver;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;

    @Column(name = "log_date", nullable = false)
    private LocalDate logDate;

    @Column(name = "start_odometer")
    private Integer startOdometer;

    @Column(name = "end_odometer")
    private Integer endOdometer;

    @Column(name = "total_trips")
    private Integer totalTrips;

    @Column(name = "gross_income", precision = 10, scale = 2)
    private BigDecimal grossIncome;

    @Column(name = "fuel_expense", precision = 10, scale = 2)
    private BigDecimal fuelExpense;

    @Column(name = "maintenance_expense", precision = 10, scale = 2)
    private BigDecimal maintenanceExpense;

    @Column(name = "other_expenses", precision = 10, scale = 2)
    private BigDecimal otherExpenses;

    @Column(name = "net_income", precision = 10, scale = 2)
    private BigDecimal netIncome;

    @Column(name = "rental_paid")
    private Boolean rentalPaid;

    @Column(name = "notes", columnDefinition = "TEXT")
    private String notes;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;
}
