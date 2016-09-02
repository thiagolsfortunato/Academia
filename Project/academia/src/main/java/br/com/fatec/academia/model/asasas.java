package br.com.fatec.academia.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class asasas {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("academia");
		EntityManager manager = factory.createEntityManager();
		System.out.println("TESTE");
		Armario teste = new Armario("teste","teste","teste");
		manager.getTransaction().begin();
		manager.persist(teste);
		manager.getTransaction().commit();
	}
	
	
	
	
}
