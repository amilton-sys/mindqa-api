package com.sys.mindqa.domain.repository;

import com.sys.mindqa.domain.model.Assinatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssinaturaRepository extends JpaRepository<Assinatura, Integer> {
}
