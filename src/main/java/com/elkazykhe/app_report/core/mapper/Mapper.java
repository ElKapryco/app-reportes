package com.elkazykhe.app_report.core.mapper;

import com.elkazykhe.app_report.infrastructure.dtos.AssignmentDTO;
import com.elkazykhe.app_report.infrastructure.dtos.DriverDTO;
import com.elkazykhe.app_report.infrastructure.dtos.VehicleDTO;
import com.elkazykhe.app_report.infrastructure.models.Assignment;
import com.elkazykhe.app_report.infrastructure.models.Driver;
import com.elkazykhe.app_report.infrastructure.models.Vehicle;

public class Mapper {
    
    public static Vehicle toEnitity(VehicleDTO vehicleDTO) {
        if (vehicleDTO == null) return null;

        return Vehicle.builder()
            .vehicleId(vehicleDTO.getVehicleId())
            .licensePlate(vehicleDTO.getLicensePlate())
            .vin(vehicleDTO.getVin())
            .brand(vehicleDTO.getBrand())
            .model(vehicleDTO.getModel())
            .year(vehicleDTO.getYear())
            .color(vehicleDTO.getColor())
            .vehicleType(vehicleDTO.getVehicleType())
            .engineNumber(vehicleDTO.getEngineNumber())
            .registrationNumber(vehicleDTO.getRegistrationNumber())
            .registrationExpiry(vehicleDTO.getRegistrationExpiry())
            .purchaseDate(vehicleDTO.getPurchaseDate())
            .purchasePrice(vehicleDTO.getPurchasePrice())
            .build();
    };

    // Vehicle
    public static VehicleDTO toDTO(Vehicle vehicle) {
        if (vehicle == null) return null;

        return VehicleDTO.builder()
            .vehicleId(vehicle.getVehicleId())
            .licensePlate(vehicle.getLicensePlate())
            .vin(vehicle.getVin())
            .brand(vehicle.getBrand())
            .model(vehicle.getModel())
            .year(vehicle.getYear())
            .color(vehicle.getColor())
            .vehicleType(vehicle.getVehicleType())
            .engineNumber(vehicle.getEngineNumber())
            .registrationNumber(vehicle.getRegistrationNumber())
            .registrationExpiry(vehicle.getRegistrationExpiry())
            .purchaseDate(vehicle.getPurchaseDate())
            .purchasePrice(vehicle.getPurchasePrice())
            .build();
    };

    // Driver
    public static DriverDTO toDTO(Driver driver) {
        if (driver == null) return null;

        return DriverDTO.builder()
            .driverId(null)
            .firstName(null)
            .lastName(null)
            .secondLastName(null)
            .phone(null)
            .email(null)
            .address(null)
            .licenseNumber(null)
            .licenseExpiry(null)
            .identificationNumber(null)
            .birthDate(null)
            .hireDate(null)
            .build();
    };

    // Assignment
    public static AssignmentDTO toDTO(Assignment assignment) {
        if (assignment == null) return null;

        return AssignmentDTO.builder()
            .assignmentId(null)
            .vehicleId(null)
            .driverId(null)
            .assignmentDate(null)
            .endDate(null)
            .shiftType(null)
            .rentalFee(null)
            .notes(null)
            .build();
    };
};
