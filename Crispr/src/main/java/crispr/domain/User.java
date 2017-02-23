package crispr.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import net.minidev.json.annotate.JsonIgnore;

@Entity
@Table
public class User {
	
	
	private long id;
	private String login;
	private String password;
	private Article article;
	
	public User() {
	}
	//constructeur
	public User (String log, String pass) {
		this.login=log;
		this.password = pass;
	}

	@JsonIgnore
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO) 	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@OneToOne
	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}


}
