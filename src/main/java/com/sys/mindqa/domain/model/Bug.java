package com.sys.mindqa.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Bug {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String descricao;
    private String passos;
    @Enumerated(EnumType.STRING)
    private StatusBug status;
    @CreationTimestamp
    private LocalDate dataReporte;
    @UpdateTimestamp
    private LocalDate dataAtualizacao;
    @ManyToOne
    @JoinColumn(name = "projeto_id")
    private ProjetoDeTeste projetoDeTeste;
}
