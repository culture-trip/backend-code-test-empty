package uk.co.devtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import uk.co.devtest.model.Article;
import uk.co.devtest.services.ArticleService;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        ArticleService service = context.getBean(ArticleService.class);
        service.deleteAllArticles();
        service.addArticle(new Article("1", "Title One", "Some content for One"));
        service.addArticle(new Article("2", "Title Two", "Some content for Two"));
        service.addArticle(new Article("3", "Title Three", "Some content for Three"));
        service.addArticle(new Article("4", "Title Four", "Some content for Four"));
        service.addArticle(new Article("5", "Title Five", "Some content for Five"));
        service.addArticle(new Article("6", "Title Six", "Some content for Six"));
        service.addArticle(new Article("7", "Title Seven", "Some content for Seven"));
        service.addArticle(new Article("8", "Title Eight", "Some content for Eight"));
        service.addArticle(new Article("9", "Title Nine", "Some content for Nine"));
    }

}
