package crispr.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import crispr.domain.Article;
import crispr.domain.User;
import crispr.domain.UserChercheur;

public class ManageUserImpl {
	EntityManager entityManager;
	
	public ManageUserImpl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		entityManager = emf.createEntityManager();
	}

	//service pour gerer un utilisateur, system de session et d'article.
	//definir les fonctions utilisateur comme "crée un utilisateur", "attribué un article".

	
	//le type est soit Visiteur soit Chercheur;
	public void creerUser (crispr.domain.User user) throws  typeException, passException {
		String login = user.getLogin();
		String password = user.getPassword();
		//trouver la fonction random
		if (user instanceof User || user instanceof UserChercheur ){
			throw new typeException("Erreur dans le type, veuillez recommencer la saisie s'il vous plaît");
		}
		else if (password.isEmpty() || password.length() < 6 ){
			throw new passException("Mot de passe vide ou trop court.");
		}
		else
		{
			User utilisateur = new User(login,password);
			entityManager.persist(utilisateur);
			//creer automatiquement l'utilisateur dans la bdd normalement
		}
	}
	public class typeException extends Exception { 
		public typeException(String message){
		   super(message);
		  }        
		}
	public class passException extends Exception {
		public passException(String message){
		    super(message);
		  }        
	}

	public void supprimerUser(User user) {
		entityManager.remove(user);
	}

	public void ajouterArticleUser(Article article) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	

}
