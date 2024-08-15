package com.sys.mindqa.domain.repository;

import com.sys.mindqa.domain.model.Execucao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExecucaoRepository extends JpaRepository<Execucao, Integer> {
}
