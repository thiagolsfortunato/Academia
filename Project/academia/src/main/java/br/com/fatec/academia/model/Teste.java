package br.com.fatec.academia.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {
	public static void main(String[] args) {
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("academia");
		EntityManager manager = factory.createEntityManager();


		Armario a = new Armario("10", "3", "4");
		manager.getTransaction().begin();
		manager.persist(a);
		manager.getTransaction().commit();

	}
	
	
	
	
}
