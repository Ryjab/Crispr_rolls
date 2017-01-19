package crispr.service;

import crispr.service.ManageUserImpl.passException;
import crispr.service.ManageUserImpl.typeException;
import crispr.domain.User;

public interface ManageUser {
	public void creerUser (User user) throws  typeException, passException;
	public void supprimerUser(String login, String password, String type);
	public void ajouterArticleUser(String titre, String repoImage, String contenu);
}
