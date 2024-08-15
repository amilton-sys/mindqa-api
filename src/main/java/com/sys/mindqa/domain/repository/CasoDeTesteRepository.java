package com.sys.mindqa.domain.repository;

import com.sys.mindqa.domain.model.CasoDeTeste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CasoDeTesteRepository extends JpaRepository<CasoDeTeste, Integer> {
}
