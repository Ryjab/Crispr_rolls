package crispr.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import crispr.domain.Article;

public class ManageArticle {
	EntityManager entityManager;
	public ManageArticle() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		entityManager = emf.createEntityManager();
	}
public void creerArticle(Article article)
	{
		Article article1 = new Article();
	}

}
