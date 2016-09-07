package br.com.fatec.academia.model;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {
	public static void main(String[] args) {
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("academia");
		EntityManager manager = factory.createEntityManager();

		//Inserção de armário
		Armario a = new Armario("10", "3", "4");
		manager.getTransaction().begin();
		manager.persist(a);
		manager.getTransaction().commit();
		
		//Inserção de atleta e seu armário
		Pessoa atleta = new Atleta("Jão", new Date(System.currentTimeMillis()), "M", a);
		manager.getTransaction().begin();
		manager.persist(atleta);
		manager.getTransaction().commit();
		
		//Inserção de professor
		Pessoa professor = new Professor("Zé", new Date(System.currentTimeMillis()), "M");
		manager.getTransaction().begin();
		manager.persist(professor);
		manager.getTransaction().commit();
		
		//Inserção de modalidade com professor e atleta
		Modalidade modalidade = new Modalidade("Judô", true, "Porrada");
		professor.addModalidade(modalidade);
		atleta.addModalidade(modalidade);
		manager.getTransaction().begin();
		manager.persist(modalidade);
		manager.getTransaction().commit();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
	
	
	
}
