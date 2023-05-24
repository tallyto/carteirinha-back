package com.br.carteirinha.controller;

import com.br.carteirinha.model.Escolaridade;
import com.br.carteirinha.service.EscolaridadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/escolaridades")
public class EscolaridadeController {
    private final EscolaridadeService escolaridadeService;

    @Autowired
    public EscolaridadeController(EscolaridadeService escolaridadeService) {
        this.escolaridadeService = escolaridadeService;
    }

    @GetMapping
    public ResponseEntity<List<Escolaridade>> getAll(){
        return ResponseEntity.ok(escolaridadeService.getAll());

    }
}
