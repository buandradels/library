package com.Library.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "minhaLista")
@Getter
@Setter
@AllArgsConstructor

public class MinhaLista {
    // criar conexao com livro = associação entre classes (uma classe sendo objeto da outra)
    // baixar pdf

    @Column(name = "pdf")
    @NotNull
    private String pdf;
}
