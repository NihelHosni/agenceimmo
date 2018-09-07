package com.agence.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agence.demo.entite.Article;
import com.agence.demo.repository.ArticleRepository;

@Service

public class ArticleService {
	
	
	
	@Autowired
	ArticleRepository ar;
	
	public void delete (long Id) {		
		ar.deleteById(Id);
	}

	public Article createArticle(Article article) {
		return ar.save(article);
	}
	
	
}
