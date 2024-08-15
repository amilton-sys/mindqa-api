package com.sys.mindqa.domain.repository;

import com.sys.mindqa.domain.model.Bug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BugRepository extends JpaRepository<Bug, Integer> {
}
