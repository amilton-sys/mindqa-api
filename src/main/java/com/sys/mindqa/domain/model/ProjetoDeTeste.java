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
    private String nome;
    private String descricao;
    private Long versao;
    @CreationTimestamp
    private LocalDate dataCricao;
    @OneToMany(mappedBy = "projetoDeTeste")
    private List<PlanoDeTeste> planosDeTeste;
    @OneToMany(mappedBy = "projetoDeTeste")
    private List<CasoDeTeste> casoDeTestes;
    @OneToMany(mappedBy = "projetoDeTeste")
    private List<Execucao> execucoes;
    @OneToMany(mappedBy = "projetoDeTeste")
    private List<Bug> bugs;
    @OneToMany(mappedBy = "projetoDeTeste")
    private List<Usuario> usuarios;
}
