package com.academia_digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academia_digital.model.AvaliacaoFisica;

@Repository
public interface AvaliacaoRepository extends JpaRepository<AvaliacaoFisica, Long> {

}
