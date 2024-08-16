package com.sys.mindqa.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PlanoDeTeste {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String objetivo;
    private String escopo;
    private String criterioDeAceitacao;
    private String recursos;
    @CreationTimestamp
    private LocalDate dataInicio;
    @UpdateTimestamp
    private LocalDate dataFim;
    @ManyToOne
    @JoinColumn(name = "projeto_id")
    private ProjetoDeTeste projetoDeTeste;
}
