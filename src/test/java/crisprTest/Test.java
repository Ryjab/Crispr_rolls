package crisprTest;

public class BddTest
{
	import java.util.List;
	import crispr.domain.User;
	import crispr.service.ManageUserImpl;
	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;

	public static void main(String[] args) {
		User user = new User("jambon","megamen","Visiteur");
		ManageUserImpl creatUser = new ManageUserImpl();
		creatUser.creerUser(user);
	}

}
