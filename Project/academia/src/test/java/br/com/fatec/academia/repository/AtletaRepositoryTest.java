package br.com.fatec.academia.repository;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import br.com.fatec.academia.model.entity.Armario;
import br.com.fatec.academia.model.entity.Atleta;
import br.com.fatec.academia.model.repository.ArmarioRepository;
import br.com.fatec.academia.model.repository.AtletaRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/applicationContext.xml" })
@Rollback
@Transactional
public class AtletaRepositoryTest {
	
	@Autowired
	AtletaRepository atletaRepo;
	@Autowired
	ArmarioRepository armarioRepo;
		
	@Test
	public void addAtleta(){
		Armario a = new Armario("10", "3", "4");
		armarioRepo.save(a);
		
		Atleta atl = new Atleta("Jão", new Date(System.currentTimeMillis()), "M", a);
		atletaRepo.save(atl);
		assertTrue(atl.getId() != null);
	}
}
