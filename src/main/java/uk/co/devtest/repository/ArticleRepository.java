package uk.co.devtest.repository;

import org.springframework.data.repository.CrudRepository;

import uk.co.devtest.model.Article;

public interface ArticleRepository extends CrudRepository<Article, String> {

}
