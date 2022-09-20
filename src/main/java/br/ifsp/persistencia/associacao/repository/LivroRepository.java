package br.ifsp.persistencia.associacao.repository;

import org.springframework.data.repository.CrudRepository;

import br.ifsp.persistencia.associacao.model.Livro;

public interface LivroRepository extends CrudRepository<Livro, Long>{
    
}
