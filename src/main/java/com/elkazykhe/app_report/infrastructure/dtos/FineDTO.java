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
public class FineDTO {
    private Integer fineId;
    private Integer vehicleId;
    private Integer driverId;
    private LocalDate fineDate;
    private String fineNumber;
    private String reason;
    private BigDecimal amount;
    private String status;
    private LocalDate paymentDate;
    private String notes;
    private LocalDateTime createdAt;
}
