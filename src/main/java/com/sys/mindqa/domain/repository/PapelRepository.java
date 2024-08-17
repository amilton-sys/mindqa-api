package com.sys.mindqa.domain.repository;

import com.sys.mindqa.domain.model.Papel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PapelRepository extends JpaRepository<Papel, Integer> {
    Papel findByNome(String nome);
}
