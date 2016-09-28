package br.com.fatec.academia.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatec.academia.model.entity.Pessoa;
import br.com.fatec.academia.model.repository.PessoaRepository;

@Service("pessoaService")
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepo;
	
	public void save(Pessoa p){
		pessoaRepo.save(p);
	}
	
	public void delete(Pessoa p){
		pessoaRepo.delete(p);
	}
	
	

}
