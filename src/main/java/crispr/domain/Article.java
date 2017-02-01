package crispr.domain;

import javax.persistence.Entity;

@Entity
public class Article{
	private long id_article;
	private String titre;
	private String repoImage;
	private String contenu;

	public Article(){}
	//constructeur
	public Article(long id_article, String titre, String repoImage, String contenu) {
		super();
		this.id_article = id_article;
		this.titre = titre;
		this.repoImage = repoImage;
		this.contenu = contenu;
	}
	
	public long getId_article() {
		return id_article;
	}
	public void setId_article(long id_article) {
		this.id_article = id_article;
	}
	public String getRepoImage() {
		return repoImage;
	}
	public void setRepoImage(String repoImage) {
		this.repoImage = repoImage;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getImage() {
		return repoImage;
	}
	public void setImage(String image) {
		this.repoImage = image;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

}
