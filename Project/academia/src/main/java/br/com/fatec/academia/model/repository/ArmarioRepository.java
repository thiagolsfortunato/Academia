package br.com.fatec.academia.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.fatec.academia.model.entity.Armario;

@Repository
public interface ArmarioRepository extends CrudRepository<Armario, Long> {
	
	public Armario findById(int id);

}
