package br.com.fatec.academia.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.fatec.academia.model.entity.Armario;
import br.com.fatec.academia.model.entity.Atleta;
import br.com.fatec.academia.model.entity.Modalidade;
import br.com.fatec.academia.model.entity.Pessoa;
import br.com.fatec.academia.model.entity.Professor;
import br.com.fatec.academia.model.service.ArmarioService;
import br.com.fatec.academia.model.service.AtletaService;
import br.com.fatec.academia.model.service.ModalidadeService;
import br.com.fatec.academia.model.service.PessoaService;
import br.com.fatec.academia.model.service.ProfessorService;

public class Teste {
	public static <S> void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		ArmarioService armarioService = (ArmarioService)context.getBean("armarioService");
		AtletaService atletaService = (AtletaService)context.getBean("atletaService");
		ModalidadeService modalidadeService = (ModalidadeService)context.getBean("modalidadeService");
		PessoaService pessoaService = (PessoaService)context.getBean("pessoaService");
		ProfessorService professorService = (ProfessorService)context.getBean("professorService");
		
		Armario a = new Armario("10", "3", "4");
		armarioService.save(a);
		
		//Inserção de professor
		Pessoa professor = new Professor("Zé", new Date(System.currentTimeMillis()), "M");
		professorService.save(professor);

		
		//Inserção de modalidade com professor e atleta
		Modalidade modalidade = new Modalidade("Judô", true, "Porrada");
		modalidade.setProfessor((Professor)professor);
		modalidadeService.save(modalidade);
		
		//Inserção de atleta e seu armário
		Pessoa atleta = new Atleta("Jão", new Date(System.currentTimeMillis()), "M", a);
		atleta.addModalidade(modalidade);
		atletaService.save(atleta);

	}
	
	
	
	
}
