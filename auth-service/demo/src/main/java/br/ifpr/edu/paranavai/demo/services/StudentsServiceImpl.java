package br.ifpr.edu.paranavai.demo.services;

import br.ifpr.edu.paranavai.demo.dto.StudentDTO;
import br.ifpr.edu.paranavai.demo.entity.StudentEntity;
import br.ifpr.edu.paranavai.demo.repository.StudentsRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentsServiceImpl implements StudentsService {

    private StudentsRepository studentsRepository;

    @Override
    public List<StudentDTO> getAllStudents() {
        List<StudentDTO> studentDTOList = new ArrayList<>();
//        ObjectMapper objectMapper = new ObjectMapper();

        try {
//            List<StudentEntity> students = studentsRepository.findAllByCpfIsNotNull();


//            if(students != null && !students.isEmpty()) {
//                studentDTOList = objectMapper.convertValue(students, new TypeReference<List<StudentDTO>>() { });
//                return studentDTOList;
//            }
            StudentDTO studentDTO = new StudentDTO();
            studentDTO.setCpf("01181623901");
            studentDTO.setEmail("lucasrachid@hotmail.com");

            studentDTOList.add(studentDTO);




        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }

        return studentDTOList;
    }
}
