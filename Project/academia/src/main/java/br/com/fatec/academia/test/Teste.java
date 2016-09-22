package br.com.fatec.academia.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.fatec.academia.model.entity.Armario;
import br.com.fatec.academia.model.entity.Atleta;
import br.com.fatec.academia.model.entity.Modalidade;
import br.com.fatec.academia.model.entity.Pessoa;
import br.com.fatec.academia.model.entity.Professor;
import br.com.fatec.academia.model.repository.ArmarioRepository;
import br.com.fatec.academia.model.repository.AtletaRepository;
import br.com.fatec.academia.model.repository.ModalidadeRepository;
import br.com.fatec.academia.model.repository.PessoaRepository;
import br.com.fatec.academia.model.repository.ProfessorRepository;

public class Teste {
	public static <S> void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		ArmarioRepository armarioRepo = (ArmarioRepository) context.getBean("armarioRepository");
		AtletaRepository atletaRepo = (AtletaRepository) context.getBean("atletaRepository");
		ModalidadeRepository modalidadeRepo = (ModalidadeRepository) context.getBean("modalidadeRepository");
		PessoaRepository pessoaRepo = (PessoaRepository) context.getBean("pessoaRepository");
		ProfessorRepository professorRepo = (ProfessorRepository) context.getBean("professorRepository");
		
		//Inserção de armário
		Armario a = new Armario("10", "3", "4");
		armarioRepo.save(a);

		
		
		//Inserção de atleta e seu armário
		Pessoa atleta = new Atleta("Jão", new Date(System.currentTimeMillis()), "M", a);
		atletaRepo.save((Atleta)atleta);
		
		//Inserção de professor
		Pessoa professor = new Professor("Zé", new Date(System.currentTimeMillis()), "M");
		professorRepo.save((Professor)professor);
		
		//Inserção de modalidade com professor e atleta
		Modalidade modalidade = new Modalidade("Judô", true, "Porrada");
		professor.addModalidade(modalidade);
		atleta.addModalidade(modalidade);
		modalidadeRepo.save(modalidade);

	}
	
	
	
	
}
