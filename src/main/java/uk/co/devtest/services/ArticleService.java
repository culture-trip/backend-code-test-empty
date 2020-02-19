package uk.co.devtest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.co.devtest.model.Article;
import uk.co.devtest.repository.ArticleRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {

    private ArticleRepository articleRepository;

    @Autowired
    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    /**
     * @return  The List of Articles from the database. If no articles in the database, it returns an empty List
     */
    public List<Article> getArticles() {
        // TODO by candidate --->

        return null; // TODO <---
    }

    /**
     * @param id    The given article Id
     * @return      Returns the article from the database for the given Id, or null if not present in the database
     */
    public Article getArticleById(String id) {
        // TODO by candidate --->

        return null; // TODO <---
    }

    public void addArticle(Article article) {
        articleRepository.save(article);
    }
    public void updateArticle(Article post) {
        articleRepository.save(post);
    }
    public void deleteArticle(String id) {
        articleRepository.deleteById(id);
    }
    public void deleteAllArticles() {
        articleRepository.deleteAll();
    }

}
