package com.elkazykhe.app_report.core.services.assignmentService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.elkazykhe.app_report.infrastructure.dtos.AssignmentDTO;

@Service
public class AssignmentService implements IAssignmentService {

    @Override
    public List<AssignmentDTO> getAllAssignment() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllAssignment'");
    }

    @Override
    public AssignmentDTO getByIdAssignment(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getByIdAssignment'");
    }

    @Override
    public AssignmentDTO setAssignment(AssignmentDTO assignmentDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAssignment'");
    }

    @Override
    public AssignmentDTO updateAssignment(Integer id, AssignmentDTO assignmentDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAssignment'");
    }

    @Override
    public AssignmentDTO deleteAssignment(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAssignment'");
    }
    
}
