package com.sys.mindqa.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Execucao {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String observacao;
    @Enumerated(EnumType.STRING)
    private StatusExecucao statusExecucao;
    private Instant tempo;
    @Enumerated(EnumType.STRING)
    private TipoExecucao tipoExecucao;
    private LocalDate dataExecucao;
    @ManyToMany
    @JoinTable(name = "execucao_caso_de_teste",
            joinColumns = @JoinColumn(name = "execucao_id"),
            inverseJoinColumns = @JoinColumn(name = "caso_de_teste_id")
    )
    private List<CasoDeTeste> casoDeTeste;
    @ManyToOne
    @JoinColumn(name = "projeto_id")
    private ProjetoDeTeste projetoDeTeste;
}
