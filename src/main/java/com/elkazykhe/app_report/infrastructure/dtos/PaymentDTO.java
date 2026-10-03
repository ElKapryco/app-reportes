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
public class PaymentDTO {
    private Integer paymentId;
    private Integer driverId;
    private Integer vehicleId;
    private Integer assignmentId;
    private LocalDate paymentDate;
    private BigDecimal amount;
    private String paymentType;
    private String paymentMethod;
    private String receiptNumber;
    private LocalDate periodStart;
    private LocalDate periodEnd;
    private String notes;
    private String status;
    private LocalDateTime createdAt;
}
