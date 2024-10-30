package com.academia_digital.service;

import java.util.List;
import com.academia_digital.model.Aluno;
import com.academia_digital.model.AvaliacaoFisica;
import com.academia_digital.model.form.AlunoForm;
import com.academia_digital.model.form.AlunoUpdateForm;


public interface IAlunoService {
  
  
  Aluno create(AlunoForm form);


  Aluno get(Long id);

  
  List<Aluno> getAll();

  
  Aluno update(Long id, AlunoUpdateForm formUpdate);

  void delete(Long id);

 
  List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);

}
