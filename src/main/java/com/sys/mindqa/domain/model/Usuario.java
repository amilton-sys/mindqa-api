package com.sys.mindqa.domain.model;

import com.sys.mindqa.domain.dto.CadastradoDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Usuario {
    @EqualsAndHashCode.Exclude
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private String senha;
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(
            name = "usuarios_papeis",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "papel_id")
    )
    private Set<Papel> papeis;
    @CreationTimestamp
    private LocalDate dataCriacao;
    @UpdateTimestamp
    private LocalDate dataAtualizacao;
    @ManyToOne
    @JoinColumn(name = "plano_id")
    private Plano plano;
    @ManyToOne
    @JoinColumn(name = "projeto_id")
    private ProjetoDeTeste projetoDeTeste;
}
