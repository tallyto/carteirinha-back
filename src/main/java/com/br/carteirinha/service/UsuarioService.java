package com.br.carteirinha.service;

import com.br.carteirinha.exception.UsuarioNaoEncontradoException;
import com.br.carteirinha.model.Usuario;
import com.br.carteirinha.repository.UsuarioRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Optional<Usuario> buscarPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    public List<Usuario> buscarTodos() {
        return usuarioRepository.findAll();
    }

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deletarPorId(Long id) {
        usuarioRepository.deleteById(id);
    }

    public Usuario atualizar(Usuario usuario) {
        Optional<Usuario> usuarioExistente = buscarPorId(usuario.getId());
        if (usuarioExistente.isPresent()) {
            Usuario usuarioAtualizado = usuarioExistente.get();
            usuarioAtualizado.setNome(usuario.getNome());
            usuarioAtualizado.setEmail(usuario.getEmail());
            usuarioAtualizado.setDataNascimento(usuario.getDataNascimento());
            usuarioAtualizado.setGenero(usuario.getGenero());
            usuarioAtualizado.setEscolaridade(usuario.getEscolaridade());
            return usuarioRepository.save(usuarioAtualizado);
        }
        throw new UsuarioNaoEncontradoException(usuario.getId());
    }
}
