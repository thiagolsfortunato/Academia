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

import br.com.fatec.academia.model.entity.Professor;
import br.com.fatec.academia.model.repository.ProfessorRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/applicationContext.xml" })
@Rollback
@Transactional
public class ProfessorRepositoryTest {
	
	@Autowired
	ProfessorRepository professorRepo;
		
	@Test
	public void addProfessor(){
		Professor prof = new Professor("Zé", new Date(System.currentTimeMillis()), "M");
		professorRepo.save(prof);
		assertTrue(prof.getId() != null);
	}
}
