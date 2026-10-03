package com.elkazykhe.app_report.infrastructure.dtos;

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
public class DriverDTO {
    private Integer driverId;
    private String firstName;
    private String lastName;
    private String secondLastName;
    private String phone;
    private String email;
    private String address;
    private String licenseNumber;
    private LocalDate licenseExpiry;
    private String identificationNumber;
    private LocalDate birthDate;
    private LocalDate hireDate;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
