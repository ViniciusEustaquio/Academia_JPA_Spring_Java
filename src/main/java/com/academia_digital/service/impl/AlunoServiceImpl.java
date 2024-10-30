package com.academia_digital.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.academia_digital.model.Aluno;
import com.academia_digital.model.AvaliacaoFisica;
import com.academia_digital.model.form.AlunoForm;
import com.academia_digital.model.form.AlunoUpdateForm;
import com.academia_digital.repository.AlunoRepository;
import com.academia_digital.service.IAlunoService;

@Service
public class AlunoServiceImpl implements IAlunoService {
    
    
    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Aluno create(AlunoForm form) {
        
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());
       
        
        return alunoRepository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return null;
        
    }

    @Override
    public List<Aluno> getAll() {
        
        return alunoRepository.findAll();
        
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
    
        return null; 
    }

    @Override
    public void delete(Long id) {
        
        
    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
     
       Aluno aluno = alunoRepository.findById(id).get();
        
        return aluno.getAvaliacoes();
        
    }

   

}
