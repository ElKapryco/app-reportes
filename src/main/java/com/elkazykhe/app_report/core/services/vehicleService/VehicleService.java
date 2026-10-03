package com.elkazykhe.app_report.core.services.vehicleService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elkazykhe.app_report.core.mapper.Mapper;
import com.elkazykhe.app_report.infrastructure.dtos.VehicleDTO;
import com.elkazykhe.app_report.infrastructure.repository.VehicleRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class VehicleService implements IVehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    private VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    };

    @Override
    public List<VehicleDTO> getAllVehicle() {
        return vehicleRepository.findAll().stream()
            .map(Mapper::toDTO).toList();
    }

    @Override
    public VehicleDTO getByIdVehicle(Integer id) {
        return vehicleRepository.findById(id)
            .map(Mapper::toDTO)
            .orElseThrow(() -> new EntityNotFoundException("Vehicle not found with id: " + id));
    }

    @Override
    public VehicleDTO setVehicle(VehicleDTO vehicleDTO) {
        var vehicleRespository = vehicleRepository.

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setVehicle'");
    }

    @Override
    public VehicleDTO updateVehicle(Integer id, VehicleDTO vehicleDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateVehicle'");
    }

    @Override
    public VehicleDTO deleteVehicle(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteVehicle'");
    }
    
}
