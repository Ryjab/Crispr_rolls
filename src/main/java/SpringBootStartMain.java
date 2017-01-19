import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by elabassi-work on 19/01/2017.
 */
@Controller
@EnableAutoConfiguration
public class SpringBootStartMain {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Demo";
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootStartMain.class, args);
    }
}
