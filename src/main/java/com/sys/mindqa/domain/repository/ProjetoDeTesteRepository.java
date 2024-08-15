package com.sys.mindqa.domain.repository;

import com.sys.mindqa.domain.model.ProjetoDeTeste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetoDeTesteRepository extends JpaRepository<ProjetoDeTeste, Integer> {
}
