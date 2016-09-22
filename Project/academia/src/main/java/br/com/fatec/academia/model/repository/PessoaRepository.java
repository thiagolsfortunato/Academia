package br.com.fatec.academia.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.fatec.academia.model.entity.Pessoa;

public interface PessoaRepository extends CrudRepository<Pessoa, Long> {

}
