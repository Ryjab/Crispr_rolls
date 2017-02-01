package crispr.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ManageArticle {
	EntityManager entityManager;
	public ManageArticle() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		entityManager = emf.createEntityManager();
	}

}
