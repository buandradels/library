package com.Library.controller;

import com.Library.model.MinhaLista;
import com.Library.repository.MinhaListaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/minhaLista")
public class MinhaListaController {
    @Autowired
    MinhaListaRepository minhaListaRepository;

    @PostMapping
    public MinhaLista criar (@RequestBody MinhaLista minhaLista) {
        return minhaListaRepository.save(minhaLista);
    }

    @GetMapping
    public List<MinhaLista> listar (){
        return minhaListaRepository.findAll();
    }
}
