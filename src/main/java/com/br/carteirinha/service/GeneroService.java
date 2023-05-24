package com.br.carteirinha.service;

import com.br.carteirinha.model.Genero;
import com.br.carteirinha.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroService {

    @Autowired
    GeneroRepository generoRepository;

    public List<Genero> getAll() {
       return generoRepository.findAll();
    }

}
