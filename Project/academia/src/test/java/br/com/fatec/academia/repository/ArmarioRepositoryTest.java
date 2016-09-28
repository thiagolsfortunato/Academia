package br.com.fatec.academia.repository;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import br.com.fatec.academia.model.entity.Armario;
import br.com.fatec.academia.model.repository.ArmarioRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/applicationContext.xml" })
@Rollback
@Transactional
public class ArmarioRepositoryTest extends AbstractTransactionalJUnit4SpringContextTests{
	
	@Autowired
	ArmarioRepository armarioRepo;
	
	@Test
	public void addArmario(){
		Armario arm = new Armario("10", "3", "4");
		armarioRepo.save(arm);
		assertTrue(arm.getId() != null);
	}
}
