package controller;

import model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ArticleService;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
     public ArticleService articleService;

    @RequestMapping("/articles")
    public List<Article> getAllArticle(){
      return   articleService.getAllArticle();

    }

    @RequestMapping("/article/id")
    public Article getArticle(@PathVariable String id){
        return articleService.getArticle(id);

    }

    @PostMapping("/article")
    public Article saveArticle(@RequestBody Article article){
        return articleService.saveArticle(article);
    }
}
