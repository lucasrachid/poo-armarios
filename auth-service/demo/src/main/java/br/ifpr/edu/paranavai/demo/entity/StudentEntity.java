package br.ifpr.edu.paranavai.demo.entity;


import lombok.*;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class StudentEntity {

        @javax.persistence.Id
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
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
