package com.chema.studentsManagement.web.resource;

import com.chema.studentsManagement.web.dto.PreviousStudentDTO;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.*;

@Log // Habilita usar logs
@RestController //Controlador de tipo Rest.
public class StudentsResource {

    //Creamos el endpoint, recibimos un DTO
    @RequestMapping(path ="/students/validate", method = RequestMethod.POST)
    //Mapeamos la llamada al método

    public void validate(@RequestBody (required = false)PreviousStudentDTO previousStudent){
        log.info("Web user request received.");
        log.info(previousStudent.toString());
    }



}
