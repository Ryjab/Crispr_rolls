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
import crispr.service.ManageArticle;
import crispr.service.ManageUserImpl;
import crispr.service.ManageUserImpl.passException;
import crispr.service.ManageUserImpl.typeException;


@RestController
public class ArticleController {
	//ManageArticle manageArticle = new ManageArticle();
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    //obtenir la liste de tout les articles
    @RequestMapping(value = "/articles", method = RequestMethod.GET)
    public List<Article> listArticle(){
		return null;
    }
    //obtenir un article spécifique.
    @RequestMapping(value = "/article", method = RequestMethod.GET)
    public Article getArticle(@RequestParam(value="titre") String titre){
			//jpa retrouve article avec titre = titre.
    		Article newarticle = new Article(1,"toto","kkk","test");
    		return newarticle;
		
    }
    //créer un article
    @RequestMapping(value = "/CreateArticle", method = RequestMethod.POST)
    
public void ajoutArticle(@RequestBody Article newArticle){
    	//manageArticle.creerArticle(newArticle);
    	System.out.println("creer un article" + newArticle);
    }
}