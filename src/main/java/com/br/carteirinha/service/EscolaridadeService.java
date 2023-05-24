package com.br.carteirinha.service;

import com.br.carteirinha.model.Escolaridade;
import com.br.carteirinha.repository.EscolaridadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EscolaridadeService {

    @Autowired
    EscolaridadeRepository escolaridadeRepository;

    public List<Escolaridade> getAll() {
        return escolaridadeRepository.findAll();
    }
}
