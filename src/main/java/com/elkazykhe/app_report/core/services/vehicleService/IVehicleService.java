package com.elkazykhe.app_report.core.services.vehicleService;

import java.util.List;

import com.elkazykhe.app_report.infrastructure.dtos.VehicleDTO;

public interface IVehicleService {
    // Get
    List<VehicleDTO> getAllVehicle();
    VehicleDTO getByIdVehicle(Integer id);

    // Post
    VehicleDTO setVehicle(VehicleDTO vehicleDTO);

    // Put
    VehicleDTO updateVehicle(Integer id, VehicleDTO vehicleDTO);

    // Delete
    VehicleDTO deleteVehicle(Integer id);
}
