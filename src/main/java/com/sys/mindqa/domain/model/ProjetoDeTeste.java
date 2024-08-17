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
public class ProjetoDeTeste {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String objetivo;
    private String metas;
    private String ferramenta;
    private String estrategia;
    private int versao;
    @CreationTimestamp
    private LocalDate dataCriacao;
    @UpdateTimestamp
    private LocalDate dataAtualizacao;
    @OneToMany(mappedBy = "projetoDeTeste")
    private List<PlanoDeTeste> planosDeTeste;
    @OneToMany(mappedBy = "projetoDeTeste")
    private List<CasoDeTeste> casoDeTestes;
    @OneToMany(mappedBy = "projetoDeTeste")
    private List<Execucao> execucoes;
    @OneToMany(mappedBy = "projetoDeTeste")
    private List<Bug> bugs;
    @OneToMany(mappedBy = "projetoDeTeste")
    private List<Usuario> equipe;
}
