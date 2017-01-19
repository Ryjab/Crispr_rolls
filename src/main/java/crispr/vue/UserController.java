package crispr.vue;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import crispr.domain.User;
import crispr.service.ManageUser;
import crispr.service.ManageUserImpl;
import crispr.service.ManageUserImpl.passException;
import crispr.service.ManageUserImpl.typeException;


@RestController
public class UserController {
	ManageUser Muser = new ManageUserImpl();
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/test")
    public User greeting(@RequestParam(value="name", defaultValue="World") String name) {
		return null;
    }
    @RequestMapping(value = "/User", method = RequestMethod.POST)
    public void AddUser(@RequestBody User user){
    	
    	try {
			Muser.creerUser(user);
		} catch (typeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (passException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}