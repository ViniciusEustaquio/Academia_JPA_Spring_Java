package com.academia_digital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.academia_digital.model.Aluno;
import com.academia_digital.model.AvaliacaoFisica;
import com.academia_digital.model.form.AvaliacaoFisicaForm;
import com.academia_digital.model.form.AvaliacaoFisicaUpdateForm;
import com.academia_digital.repository.AlunoRepository;
import com.academia_digital.repository.AvaliacaoRepository;
import com.academia_digital.service.IAvaliacaoFisicaService;







public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {
    
    
    @Autowired
    private AvaliacaoRepository avaliacaoRepository;
    
    
    @Autowired
    private AlunoRepository alunoRepository;
    

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
        
        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());
        
        
        return  avaliacaoRepository.save(avaliacaoFisica);
        
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
     
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
  
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
