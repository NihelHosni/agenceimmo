package com.agence.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.agence.demo.entite.Article;


public interface ArticleRepository extends JpaRepository<Article, Long>{


	List <Article> findById( long Id);
	List<Article>  findAll();
	
	List<Article> findByPrix (long Prix);
	
	List<Article> findByEmplacement (String Emplacement);
	List<Article> findByPrixLessThanOrderByPrixDesc (long prix);

}

