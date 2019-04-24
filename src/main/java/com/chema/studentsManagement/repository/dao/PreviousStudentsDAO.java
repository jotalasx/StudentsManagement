package com.chema.studentsManagement.repository.dao;

import com.chema.studentsManagement.repository.entity.PreviousStudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreviousStudentsDAO extends JpaRepository<PreviousStudentEntity, Long> {



}
