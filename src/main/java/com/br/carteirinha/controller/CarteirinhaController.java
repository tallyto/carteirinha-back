package com.br.carteirinha.controller;

import com.br.carteirinha.model.Carteirinha;
import com.br.carteirinha.service.CarteirinhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carteirinhas")
public class CarteirinhaController {

    private final CarteirinhaService carteirinhaService;

    @Autowired
    public CarteirinhaController(CarteirinhaService carteirinhaService) {
        this.carteirinhaService = carteirinhaService;
    }

    @GetMapping
    public List<Carteirinha> findAll() {
        return carteirinhaService.findAll();
    }

    @GetMapping("/{id}")
    public Carteirinha findById(@PathVariable Long id) {
        Optional<Carteirinha> carteirinhaOptional = carteirinhaService.findById(id);
        return carteirinhaOptional.orElse(null);
    }

    @PostMapping
    public Carteirinha save(@RequestBody Carteirinha carteirinha) {
        return carteirinhaService.save(carteirinha);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        carteirinhaService.deleteById(id);
    }
}
