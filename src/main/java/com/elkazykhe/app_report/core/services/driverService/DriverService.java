package com.elkazykhe.app_report.core.services.driverService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elkazykhe.app_report.infrastructure.dtos.DriverDTO;
import com.elkazykhe.app_report.infrastructure.repository.DriverRepository;

@Service
public class DriverService implements IDriverService {

    @Autowired
    private DriverRepository driverRepository;

    private DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    };

    @Override
    public List<DriverDTO> getAllDriver() {

        return driverRepository.findAll().;
    }

    @Override
    public DriverDTO getByIdDriver(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getByIdDriver'");
    }

    @Override
    public DriverDTO setDriver(DriverDTO driverDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDriver'");
    }

    @Override
    public DriverDTO updateDriver(Integer id, DriverDTO driverDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateDriver'");
    }

    @Override
    public DriverDTO deleteDriver(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteDriver'");
    }
    
}
