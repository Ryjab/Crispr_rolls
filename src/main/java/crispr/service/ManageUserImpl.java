package crispr.service;

import crispr.domain.Article;
import crispr.domain.User;

public class ManageUserImpl implements ManageUser {
	//service pour gerer un utilisateur, system de session et d'article.
	//definir les fonctions utilisateur comme "crée un utilisateur", "attribué un article".

	
	//le type est soit Visiteur soit Chercheur;
	public void creerUser (crispr.vue.User user) throws  typeException, passException {
		String login = user.getLogin();
		String password = user.getPassword();
		String type = user.getType();
		//trouver la fonction random
		if (type != "Visiteur" || type != "Chercheur"){
			throw new typeException("Erreur dans le type, veuillez recommencer la saisie s'il vous plaît");
		}
		else if (password.isEmpty() || password.length() < 6 ){
			throw new passException("Mot de passe vide ou trop court.");
		}
		else
		{
			User utilisateur = new User(login,password,type);
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
	public void supprimerUser(String login, String password, String type){
		//voir comment interagir avec la BDD
	}
	
	public void ajouterArticleUser(String titre, String repoImage, String contenu)
	{
		Article article = new Article(titre, repoImage, contenu);
		
	}

	
	
	
	
	

}
