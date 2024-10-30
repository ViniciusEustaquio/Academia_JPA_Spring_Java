package com.academia_digital.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academia_digital.model.Aluno;
import com.academia_digital.model.AvaliacaoFisica;
import com.academia_digital.model.form.AlunoForm;
import com.academia_digital.service.impl.AlunoServiceImpl;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    
    
    
    @Autowired
    private AlunoServiceImpl alunoServiceImpl;
    
    @GetMapping
    public List<Aluno> getAll(){
        return alunoServiceImpl.getAll();
    }
    
    
    @PostMapping
    public Aluno create(@RequestBody AlunoForm form){
        
        return alunoServiceImpl.create(form);
        
    }
    
    
    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisica (@PathVariable Long id){
        return alunoServiceImpl.getAllAvaliacaoFisicaId(id);
    }
   

}
