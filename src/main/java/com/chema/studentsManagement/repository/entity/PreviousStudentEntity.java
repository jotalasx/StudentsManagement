package com.chema.studentsManagement.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name ="PreviousStudents")
public class PreviousStudentEntity {
    /* Esto es lo que almacenará la base de datos.
       Es un POJO, pero a su vez, una representación de una base de datos.
       Conecta la clase con la tabla ("name" le da el nombre a la tabla)*/

    @Id
    @GeneratedValue
    @Column(name = "StudentID")
    private Long studentID;

    // Si el parámetro y la columna se llaman igual, no hace falta especificar nada

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "DateOfBirth")
    private String birthDate;
}
