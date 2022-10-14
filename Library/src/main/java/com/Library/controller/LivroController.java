package com.Library.controller;

import com.Library.model.Livro;
import com.Library.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livro")
public class LivroController {
    @Autowired
    LivroRepository livroRepository;

    @PostMapping
    public Livro criar (@RequestBody Livro cliente) {
        return livroRepository.save(cliente);
    }

    @GetMapping
    public List<Livro> listar (){
        return livroRepository.findAll();
    }
}
