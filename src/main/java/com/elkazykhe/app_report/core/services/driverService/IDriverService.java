package com.elkazykhe.app_report.core.services.driverService;

import java.util.List;

import com.elkazykhe.app_report.infrastructure.dtos.DriverDTO;

public interface IDriverService {
    // Get
    List<DriverDTO> getAllDriver();
    DriverDTO getByIdDriver(Integer id);

    // Post
    DriverDTO setDriver(DriverDTO driverDTO);

    // Put
    DriverDTO updateDriver(Integer id, DriverDTO driverDTO);

    // Delete
    DriverDTO deleteDriver(Integer id);
}
