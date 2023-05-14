package com.br.carteirinha.repository;

import com.br.carteirinha.model.Carteirinha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarteirinhaRepository extends JpaRepository<Carteirinha, Long> {
}
