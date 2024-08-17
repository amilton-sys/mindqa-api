package com.sys.mindqa.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;

@Entity
@Data
public class Papel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer papelId;
    private String nome;

    @Getter
    public enum Tipo {
        LIDER(1L),
        MEMBRO(2L);
        final long papelId;

        Tipo(long papelId) {
            this.papelId = papelId;
        }
    }
}
