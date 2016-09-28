package br.com.fatec.academia.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import br.com.fatec.academia.model.entity.Armario;
import br.com.fatec.academia.model.service.ArmarioService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/applicationContext.xml" })
@Rollback
@Transactional
public class ArmarioServiceTest {
	
	@Autowired
	ArmarioService armarioService;
	
	@Test
	public void addArmario(){
		Armario arm = new Armario("10", "3", "4");
		armarioService.save(arm);
		assertEquals(1,arm.getId());
	}
}
