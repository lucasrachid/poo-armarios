package br.ifpr.edu.paranavai.demo.controller;

import br.ifpr.edu.paranavai.demo.dto.StudentDTO;
import br.ifpr.edu.paranavai.demo.services.StudentsService;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Controller
@RequestMapping({"/v1"})
public class StudentsController {

    private final StudentsService studentsService;

    public StudentsController(StudentsService studentsService) {
        this.studentsService = studentsService;
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public ResponseEntity<List<StudentDTO>> getUsers() {
        List<StudentDTO> studentDTO = studentsService.getAllStudents();
        return new ResponseEntity<List<StudentDTO>>(studentDTO, HttpStatus.OK);
    }

//    @GetMapping(path = {"/{id}"})
//    public ResponseEntity findById(@PathVariable long id){
//        return repository.findById(id)
//                .map(record -> ResponseEntity.ok().body(record))
//                .orElse(ResponseEntity.notFound().build());
//    }

//    @PostMapping
//    public Contact create(@RequestBody Contact contact){
//        return repository.save(contact);
//    }

//    @PutMapping(value="/{id}")
//    public ResponseEntity update(@PathVariable("id") long id,
//                                 @RequestBody Contact contact) {
//        return repository.findById(id)
//                .map(record -> {
//                    record.setName(contact.getName());
//                    record.setEmail(contact.getEmail());
//                    record.setPhone(contact.getPhone());
//                    Contact updated = repository.save(record);
//                    return ResponseEntity.ok().body(updated);
//                }).orElse(ResponseEntity.notFound().build());
//    }

//    @DeleteMapping(path ={"/{id}"})
//    public ResponseEntity <?> delete(@PathVariable long id) {
//        return repository.findById(id)
//                .map(record -> {
//                    repository.deleteById(id);
//                    return ResponseEntity.ok().build();
//                }).orElse(ResponseEntity.notFound().build());
//    }


}
