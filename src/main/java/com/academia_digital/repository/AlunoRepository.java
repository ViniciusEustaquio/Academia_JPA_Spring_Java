package com.academia_digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academia_digital.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
