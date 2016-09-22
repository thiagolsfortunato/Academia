package br.com.fatec.academia.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.fatec.academia.model.entity.Professor;

public interface ProfessorRepository extends CrudRepository<Professor, Long> {
	
	

}
