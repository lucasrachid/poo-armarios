package br.ifpr.edu.paranavai.demo.services;

import br.ifpr.edu.paranavai.demo.dto.StudentDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentsService {
    List<StudentDTO> getAllStudents();
}
