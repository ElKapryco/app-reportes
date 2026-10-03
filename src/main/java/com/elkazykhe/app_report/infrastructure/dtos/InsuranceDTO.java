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
public class InsuranceDTO {
    private Integer insuranceId;
    private Integer vehicleId;
    private String insuranceCompany;
    private String policyNumber;
    private String policyType;
    private LocalDate startDate;
    private LocalDate endDate;
    private BigDecimal premiumAmount;
    private String paymentFrequency;
    private String status;
    private LocalDateTime createdAt;
}
