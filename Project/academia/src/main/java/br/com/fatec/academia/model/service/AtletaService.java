package br.com.fatec.academia.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatec.academia.model.entity.Atleta;
import br.com.fatec.academia.model.entity.Pessoa;
import br.com.fatec.academia.model.repository.AtletaRepository;

@Service("atletaService")
public class AtletaService {
	
	@Autowired
	private AtletaRepository atletaRepo;

	public void save(Pessoa atleta) {
		atletaRepo.save((Atleta)atleta);
	}

	public void delete(Pessoa atleta) {
		atletaRepo.delete((Atleta)atleta);
	}

}
