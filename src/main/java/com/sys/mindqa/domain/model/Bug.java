package com.sys.mindqa.domain.model;

import com.sys.mindqa.domain.model.enums.Prioridade;
import com.sys.mindqa.domain.model.enums.StatusBug;
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
    @Enumerated(EnumType.STRING)
    private Prioridade prioridade;
    private String resultadoEsperado;
    private String resultadoAtual;
    private String evidenciaUrl;
    private String observacao;
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
