package com.agence.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agence.demo.entite.Article;
import com.agence.demo.repository.ArticleRepository;
import com.agence.demo.service.ArticleService;



@RestController
public class ArticleController {


	@Autowired
	private ArticleRepository ar ;
	
	@Autowired
	private ArticleService articleService;
	
	
	
	@GetMapping(value = "/getarticle/{ArticleId}")
	public List<Article> getArticle(@PathVariable("ArticleId") long ArticleId) {
		
		return ar.findById(ArticleId);
	}
	
	
	@GetMapping(value ="/allarticals")
	public List<Article> getAllArticle() {
	
			return ar.findAll();
		}
	@GetMapping("/getprix/{ArticlePrix}")
	public List<Article> getArticlePrix(@PathVariable("ArticlePrix") long ArticlePrix) {
		
		return 	ar.findByPrix(ArticlePrix);
		
	}
	
	@GetMapping("/getemplacement/{ArticleEmplacement}")
	public List<Article> getArticleEmplacement(@PathVariable("ArticleEmplacement") String ArticleEmplacement) {
		
		return 	ar.findByEmplacement(ArticleEmplacement);	
	
	}	
	
	@GetMapping("/getprixlow/{prix}")
	public List<Article> findByPrixLessThanOrderByPrix(@PathVariable("prix") long prix) {
		
		return 	ar.findByPrixLessThanOrderByPrixDesc(prix);	
	
	}	
	@RequestMapping(value = "/deleteArticle/{articleId}", method = RequestMethod.GET)
	public void deleteArticle(@PathVariable("articleId") long articleId) {
		articleService.delete(articleId);
	}
	
	@RequestMapping(value = "/createArticle", method = RequestMethod.POST)
	public Article createArticle(@RequestBody Article article) {
		return articleService.createArticle(article);
	}
	
	
	
	
	
	
	
	
}
