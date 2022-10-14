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
    public Livro criar (@RequestBody Livro livro) {
        return livroRepository.save(livro);
    }

    @GetMapping
    public List<Livro> listar (){
        return livroRepository.findAll();
    }
}
