package com.sys.mindqa.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ProjetoDeTeste {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true, length = 100, nullable = false)
    private String nome;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String descricao;
    @Column(nullable = false)
    private Long versao;
    @CreationTimestamp
    private LocalDate dataCricao;
    @OneToMany
    private List<PlanoDeTeste> planosDeTeste;
    @OneToMany
    private List<CasoDeTeste> casoDeTestes;
    @OneToMany
    private List<Execucao> execucoes;
    @OneToMany
    private List<Bug> bugs;
}
