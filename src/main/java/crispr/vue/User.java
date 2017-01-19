package crispr.vue;

public class User {

	String login, password, type;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String login, String password, String type) {
		super();
		this.login = login;
		this.password = password;
		this.type = type;
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
