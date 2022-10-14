package com.Library.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

    @Entity
    @Table(name = "livro")
    @Getter
    @Setter
    @AllArgsConstructor

    //criar conexão com MinhaLista
    public class Livro {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id_livro;

        @Column(name = "foto")
        @NotNull
        private String foto;

        @Column(name = "titulo")
        @NotNull
        private String titulo;

        @Column(name= "categoria")
        @NotNull
        private int categoria;

        @Column(name = "sinopse")
        @NotNull
        private String sinopse;

        @Column(name= "num_paginas")
        @NotNull
        private int num_paginas;

        @Column(name= "faixa_etaria")
        @NotNull
        private int faixa_etaria;

        @Column(name = "autor")
        @NotNull
        private String autor;

        @Column(name = "edicao_ano")
        @NotNull
        private String edicao_ano;

        @Column(name= "tags")
        @NotNull
        private int tags;
    }