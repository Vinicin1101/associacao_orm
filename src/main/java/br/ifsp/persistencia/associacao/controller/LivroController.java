package br.ifsp.persistencia.associacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.ifsp.persistencia.associacao.model.Livro;
import br.ifsp.persistencia.associacao.repository.LivroRepository;

@RestController
@CrossOrigin
public class LivroController {
    
    // Injeção
    @Autowired
    LivroRepository repo;

    // Rotas
    @PostMapping("/livro")
    public void adicionaLivro( @RequestBody Livro livro ){
        repo.save(livro);
    }

    @GetMapping("/livro")
    public List<Livro> recuperaLivros(){
        return (List<Livro>)repo.findAll();
    }
}
