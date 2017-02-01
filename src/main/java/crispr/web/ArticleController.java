package crispr.web;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import crispr.domain.Article;
import crispr.domain.User;
import crispr.service.ManageUserImpl;
import crispr.service.ManageUserImpl.passException;
import crispr.service.ManageUserImpl.typeException;


@RestController
public class ArticleController {
	ManageUserImpl Muser = new ManageUserImpl();
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/test")
    public User greeting(@RequestParam(value="name", defaultValue="World") String name) {
		return null;
    }
    @RequestMapping(value = "/articles", method = RequestMethod.GET)
    public List<Article> listArticle(){
		return null;
    }
}