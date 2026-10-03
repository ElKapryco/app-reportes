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
public class VehicleDTO {
    private Integer vehicleId;
    private String licensePlate;
    private String vin;
    private String brand;
    private String model;
    private Integer year;
    private String color;
    private String vehicleType;
    private String engineNumber;
    private String registrationNumber;
    private LocalDate registrationExpiry;
    private LocalDate purchaseDate;
    private BigDecimal purchasePrice;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;  
}
