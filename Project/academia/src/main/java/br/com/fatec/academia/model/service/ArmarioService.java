package br.com.fatec.academia.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatec.academia.model.entity.Armario;
import br.com.fatec.academia.model.repository.ArmarioRepository;

@Service("armarioService")
public class ArmarioService {
	
	@Autowired
	private ArmarioRepository armarioRepo;
	
	public void save(Armario a){
		armarioRepo.save(a);
	}
	
	public void delete(Armario a){
		armarioRepo.delete(a);
	}
	
	

}
