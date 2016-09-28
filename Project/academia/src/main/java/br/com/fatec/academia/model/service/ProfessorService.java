package br.com.fatec.academia.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatec.academia.model.entity.Pessoa;
import br.com.fatec.academia.model.entity.Professor;
import br.com.fatec.academia.model.repository.ProfessorRepository;

@Service("professorService")
public class ProfessorService {

	@Autowired
	private ProfessorRepository professorRepo;

	public void save(Pessoa professor) {
		professorRepo.save((Professor)professor);
	}

	public void delete(Pessoa professor) {
		professorRepo.delete((Professor)professor);
	}

}
