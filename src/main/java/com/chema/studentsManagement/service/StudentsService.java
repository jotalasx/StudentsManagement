package com.chema.studentsManagement.service;

import com.chema.studentsManagement.web.dto.PreviousStudentDTO;

public interface StudentsService {

    PreviousStudentDTO search(PreviousStudentDTO studentDTO);
}
