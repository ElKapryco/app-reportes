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
public class MaintenanceDTO {
    private Integer maintenanceId;
    private Integer vehicleId;
    private LocalDate maintenanceDate;
    private String maintenanceType;
    private String description;
    private BigDecimal cost;
    private String workshopName;
    private Integer odometerKm;
    private String status;
    private LocalDate nextMaintenanceDate;
    private LocalDateTime createdAt;
}
