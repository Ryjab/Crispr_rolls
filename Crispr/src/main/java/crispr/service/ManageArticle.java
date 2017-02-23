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
		

	}
public void creerArticle(Article article)
	{
		EntityManagerFactory emfactory = Persistence.
			createEntityManagerFactory( "Eclipselink_JPA" );
		EntityManager entityManager = emfactory.
			createEntityManager( );
		entityManager.getTransaction( ).begin( );
		entityManager.persist(article);
		listarticle.add(article);
		entityManager.getTransaction( ).commit( );
		entityManager.close( );
		emfactory.close( );
	}
public void supprimerArticle(Article article)
{
	entityManager.remove(article);
}

}
