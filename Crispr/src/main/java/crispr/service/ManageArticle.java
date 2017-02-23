package crispr.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import crispr.domain.Article;

public class ManageArticle {
	private List<Article> listarticle;
	EntityManager entityManager;
	public ManageArticle() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		entityManager = emf.createEntityManager();
	}
public void creerArticle(Article article)
	{
		entityManager.persist(article);
		listarticle.add(article);
	}
public void supprimerArticle(String titre)
{
	
}

}
