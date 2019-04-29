package com.chema.studentsManagement.service.impl;

import com.chema.studentsManagement.service.StudentsService;
import com.chema.studentsManagement.web.dto.PreviousStudentDTO;
import org.springframework.stereotype.Service;

@Service
public class StudentsServiceImpl implements StudentsService {

    @Override
    public PreviousStudentDTO search(PreviousStudentDTO studentDTO) {

        String fullName = String.format("s1 s2, s3", studentDTO.getFirstName(), studentDTO.getLastName(), studentDTO.getName());
        String dateOfBirth;
        return null;
    }
}
