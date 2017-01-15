package domain;

import javax.persistence.Entity;

@Entity
public class Article {
	private String titre;
	private String image;
	private String contenu;
	
	//constructeur
	public Article(String title, String repositoryOfImage, String content)	{
		this.titre = title;
		this.image = repositoryOfImage;
		this.contenu = content;
	}
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

}
