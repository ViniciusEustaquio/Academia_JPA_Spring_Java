package com.academia_digital.service;

import java.util.List;

import com.academia_digital.model.Matricula;
import com.academia_digital.model.form.MatriculaForm;

public interface IMatriculaService {
    
     Matricula create(MatriculaForm form);


  Matricula get(Long id);

 
  List<Matricula> getAll(String bairro);

 
  void delete(Long id);

    
    

}
