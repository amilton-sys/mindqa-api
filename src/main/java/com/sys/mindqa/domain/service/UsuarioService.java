package com.sys.mindqa.domain.service;

import com.sys.mindqa.domain.dto.CadastradoDTO;
import com.sys.mindqa.domain.dto.CadastroDTO;
import com.sys.mindqa.domain.model.Papel;
import com.sys.mindqa.domain.model.Usuario;
import com.sys.mindqa.domain.repository.PapelRepository;
import com.sys.mindqa.domain.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final PapelRepository papelRepository;

    public UsuarioService(UsuarioRepository usuarioRepository, PapelRepository papelRepository) {
        this.usuarioRepository = usuarioRepository;
        this.papelRepository = papelRepository;
    }

    @Transactional
    public CadastradoDTO cadastrar(CadastroDTO dto) {
        var papelMembro = papelRepository.findByNome(Papel.Tipo.MEMBRO.name());
        var usuarioDb = usuarioRepository.findByEmail(dto.email());
        if (usuarioDb.isPresent()) {
            throw new RuntimeException(String.format("Usuário com email %s já exise.", dto.email()));
        }
        var usuario = new Usuario();
        BeanUtils.copyProperties(dto, usuario);
        usuario.setPapeis(Set.of(papelMembro));
        usuario = usuarioRepository.save(usuario);
        return new CadastradoDTO(usuario);
    }

}
