package com.sys.mindqa.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PlanoDeTeste {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String objetivo;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String escopo;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String criterioDeAceitacao;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String recursos;
    @CreationTimestamp
    private LocalDate dataInicio;
    @UpdateTimestamp
    private LocalDate dataFim;
}
