package crispr.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import crispr.domain.Article;

public class ManageArticle {
	EntityManager entityManager;
	public ManageArticle() {
		EntityManagerFactory emfactory = Persistence.
				createEntityManagerFactory( "manager1" );
			 entityManager = emfactory.
				createEntityManager( );	

	}
public void creerArticle(Article article)
	{
		entityManager.getTransaction( ).begin( );
		entityManager.persist(article);
		entityManager.getTransaction( ).commit( );	
	}
public void supprimerArticle(Article article)
{

	entityManager.getTransaction( ).begin( );
	entityManager.remove(article);
	entityManager.getTransaction( ).commit( );

}
public List<Article> listArticle(){
	return entityManager.createQuery("select c from Article").getResultList();
}

}
