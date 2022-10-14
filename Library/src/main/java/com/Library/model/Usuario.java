package com.Library.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pessoa")
@Getter
@Setter
@AllArgsConstructor

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;

    @Column(name = "nome")
    @NotNull
    private String nome;

    @Column(name = "email")
    @NotNull
    private String email;

    @Column(name = "senha")
    @NotNull
    private String senha;
}
