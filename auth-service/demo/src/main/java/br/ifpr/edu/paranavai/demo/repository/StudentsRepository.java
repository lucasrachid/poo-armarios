package br.ifpr.edu.paranavai.demo.repository;

import br.ifpr.edu.paranavai.demo.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsRepository extends JpaRepository<StudentEntity, Long> {

    List<StudentEntity> findAllByCpfIsNotNull();
}
