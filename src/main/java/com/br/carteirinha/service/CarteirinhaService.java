package com.br.carteirinha.service;

import com.br.carteirinha.model.Carteirinha;
import com.br.carteirinha.repository.CarteirinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CarteirinhaService {

    private CarteirinhaRepository carteirinhaRepository;

    @Autowired
    public CarteirinhaService(CarteirinhaRepository carteirinhaRepository) {
        this.carteirinhaRepository = carteirinhaRepository;
    }

    public List<Carteirinha> findAll() {
        return carteirinhaRepository.findAll();
    }

    public Optional<Carteirinha> findById(Long id) {
        return carteirinhaRepository.findById(id);
    }

    public Carteirinha save(Carteirinha carteirinha) {
        return carteirinhaRepository.save(carteirinha);
    }

    public void deleteById(Long id) {
        carteirinhaRepository.deleteById(id);
    }
}
