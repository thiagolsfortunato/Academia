package br.com.fatec.academia.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatec.academia.model.entity.Modalidade;
import br.com.fatec.academia.model.repository.ModalidadeRepository;

@Service("modalidadeService")
public class ModalidadeService {
	
	@Autowired
	private ModalidadeRepository modalidadeRepo;
	
	public void save(Modalidade m){
		modalidadeRepo.save(m);
	}
	
	public void delete(Modalidade m){
		modalidadeRepo.delete(m);
	}

}
