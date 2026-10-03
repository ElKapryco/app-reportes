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
public class AssignmentDTO {
    private Integer assignmentId;
    private Integer vehicleId;
    private Integer driverId;
    private LocalDate assignmentDate;
    private LocalDate endDate;
    private String shiftType;
    private BigDecimal rentalFee;
    private String notes;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
