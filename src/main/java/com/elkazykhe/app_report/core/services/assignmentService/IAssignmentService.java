package com.elkazykhe.app_report.core.services.assignmentService;

import java.util.List;

import com.elkazykhe.app_report.infrastructure.dtos.AssignmentDTO;

public interface IAssignmentService {
    // Get
    List<AssignmentDTO> getAllAssignment();
    AssignmentDTO getByIdAssignment(Integer id);

    // Post
    AssignmentDTO setAssignment(AssignmentDTO assignmentDTO);

    // Put
    AssignmentDTO updateAssignment(Integer id, AssignmentDTO assignmentDTO);

    // Delete
    AssignmentDTO deleteAssignment(Integer id);
}
