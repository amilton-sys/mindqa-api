package com.sys.mindqa.domain.dto;

import com.sys.mindqa.domain.model.Usuario;

public record CadastradoDTO(
        String nome,
        String email
) {
    public CadastradoDTO(Usuario usuarioSalvo) {
        this(usuarioSalvo.getNome(), usuarioSalvo.getEmail());
    }
}
