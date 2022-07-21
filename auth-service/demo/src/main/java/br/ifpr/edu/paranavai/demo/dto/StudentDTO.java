package br.ifpr.edu.paranavai.demo.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;


@Getter
@Setter
@Repository
public class StudentDTO {

    private Long id;
    private String name;
    private String cpf;
    private String ra; // Registro Acadêmico
    private String phone;
    private String password;
    private String course; // Curso
    private String gang; // Turma
    private String email;

}
