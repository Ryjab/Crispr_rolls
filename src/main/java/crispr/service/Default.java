package crispr.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Default {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
	EntityManager entityManager = emf.createEntityManager();
	

}
