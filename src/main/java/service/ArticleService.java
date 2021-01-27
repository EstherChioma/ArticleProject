package service;

import model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.ArticleRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ArticleService {

    @Autowired
    ArticleRepository articleRepository;


    public List<Article > getAllArticle(){
        return articleRepository.findAll() ;
    }

    public Article getArticle(String id){
        return articleRepository.getArticleById(id);
    }

    public Article saveArticle(Article article){

        return articleRepository.save(article);
    }


}
