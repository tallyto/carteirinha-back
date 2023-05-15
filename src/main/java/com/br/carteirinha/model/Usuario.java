package com.br.carteirinha.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@Table(name = "usuario")
@Getter
@Setter
public class Usuario extends Auditable {

    public Usuario(){}

    public Usuario(String id){
        this.id = Long.parseLong(id);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "escolaridade_id")
    private Escolaridade escolaridade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "genero_id")
    private Genero genero;

    private String cpf;

    private String celular;

    @Column(name = "instituicao")
    private String instituicao;

    private String curso;

    // getters e setters
}
