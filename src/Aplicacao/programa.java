package Aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class programa {

	public static void main(String[] args) {
		
		//Pessoa p1 = new Pessoa(null, "carlos da Silva", "carlos@gmail.com");
		Pessoa p4 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		//Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//Pessoa p4 = em.find(Pessoa.class, 5);
		//em.getTransaction().begin();
		//em.remove(p4);
		//em.getTransaction().commit();
		
		System.out.println(p4);
		
		em.getTransaction().begin();
		//em.persist(p1);
		//em.persist(p2);
		em.persist(p4);
		em.getTransaction().commit();
		System.out.println("Pronto!");
		em.close();
		emf.close();

		
	}	
	

}
