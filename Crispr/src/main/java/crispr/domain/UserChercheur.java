package crispr.domain;

public class UserChercheur extends User {
	private String familyName;
	private String firstname;
	private int referenceChercheur;

	public UserChercheur(String familyName, String firstname, int referenceChercheur) {
		super();
		this.familyName = familyName;
		this.firstname = firstname;
		this.referenceChercheur = referenceChercheur;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public int getReferenceChercheur() {
		return referenceChercheur;
	}

	public void setReferenceChercheur(int referenceChercheur) {
		this.referenceChercheur = referenceChercheur;
	}

	public UserChercheur() {
		// TODO Auto-generated constructor stub
	}

	public UserChercheur(String log, String pass) {
		super(log, pass);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserChercheur [familyName=" + familyName + ", firstname=" + firstname + ", referenceChercheur="
				+ referenceChercheur + "]";
	}
	

}
