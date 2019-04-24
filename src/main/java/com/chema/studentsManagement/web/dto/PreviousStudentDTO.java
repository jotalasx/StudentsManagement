package com.chema.studentsManagement.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Representación de la info que nos llega a través del formulario
//Hay que transformarlo en un objeto

@Data // Genera, en tiempo de compilación, get, set, equals, hashcode...
@NoArgsConstructor // Constructor sin argumentos
@AllArgsConstructor // Constructor oon todos los argumentos
public class PreviousStudentDTO {

    private String name;
    private String firstName;
    private String lastName;
    private String birthDate;


}
