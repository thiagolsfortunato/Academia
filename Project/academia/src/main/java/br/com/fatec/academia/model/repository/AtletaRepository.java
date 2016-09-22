package br.com.fatec.academia.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.fatec.academia.model.entity.Atleta;

public interface AtletaRepository extends CrudRepository<Atleta, Long> {

}
