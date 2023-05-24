package com.br.carteirinha.controller;

import com.br.carteirinha.model.Genero;
import com.br.carteirinha.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/generos")
public class GeneroController {

    @Autowired
    GeneroService generoService;

    @GetMapping
    ResponseEntity<List<Genero>> getAll() {
        return ResponseEntity.ok(generoService.getAll());
    }
}
