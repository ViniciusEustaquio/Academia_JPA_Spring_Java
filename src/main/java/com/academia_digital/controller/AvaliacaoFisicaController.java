package com.academia_digital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academia_digital.model.AvaliacaoFisica;
import com.academia_digital.model.form.AvaliacaoFisicaForm;
import com.academia_digital.service.impl.AvaliacaoFisicaServiceImpl;

@RestController
@RequestMapping("/avaliacao")
public class AvaliacaoFisicaController {
    
    @Autowired
    private AvaliacaoFisicaServiceImpl avaliacaoFisicaServiceImpl;
    
    
    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form){
            return avaliacaoFisicaServiceImpl.create(form);       
    }
}
