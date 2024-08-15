package com.sys.mindqa.domain.repository;

import com.sys.mindqa.domain.model.PlanoDeTeste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanoDeTesteRepository extends JpaRepository<PlanoDeTeste, Integer> {
}
