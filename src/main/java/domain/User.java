package domain;
import org.springframework.boot.SpringApplication;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	private int id;
	
	private String login;
	
	private String password;
	
	private String type;
	

	
	//constructeur
	public User (String log, String pass, String type) {
		this.login=log;
		this.password = pass;
		this.type = type;
	}
	
	public int getId() {
		return id;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public void setId(int id) {
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}


}
