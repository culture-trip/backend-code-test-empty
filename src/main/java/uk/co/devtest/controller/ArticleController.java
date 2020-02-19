package uk.co.devtest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uk.co.devtest.exception.ForbiddenException;
import uk.co.devtest.exception.UnknownException;
import uk.co.devtest.model.Article;
import uk.co.devtest.model.EnrichedArticle;
import uk.co.devtest.services.ArticleService;
import uk.co.devtest.services.ExternalService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
public class ArticleController {

    private ArticleService articleService;
    private ExternalService externalService;

    @Autowired
    public ArticleController(ArticleService articleService, ExternalService externalService) {
        this.articleService = articleService;
        this.externalService = externalService;
    }

    /**
     * This method requests the Article for the given Id to the ExternalService.
     * If it is provided by the ExternalService, then builds the corresponding EnrichedArticle and returns the proper
     * ResponseEntity<EnrichedArticle>.
     *
     * If it is not provided by the ExternalService, then requests the Article for the given Id to the database.
     * If it is returned from the database, then builds the corresponding EnrichedArticle and returns the proper
     * ResponseEntity<EnrichedArticle>.
     * If it is not present in the database, then returns the appropriate response
     *
     * This method handles the possible exceptions that may occur, and logs the convenient warns or errors.
     *
     * @param id    The given article id
     * @return      The ResponseEntity<EnrichedArticle> if the corresponding Article can be retrieved from
     *              the ExternalService or from the database
     */
    @RequestMapping("articles/{id}")
    public ResponseEntity<EnrichedArticle> getEnrichedArticleById(@PathVariable String id) {
        // TODO by candidate --->

        return null; // TODO <---
    }

    /**
     * This method requests the List of Articles to the database.
     * If it is returned from the database, then builds the corresponding EnrichedArticle and returns the proper
     * ResponseEntity<List<EnrichedArticle>>.
     * If it is not present in the database, then returns the appropriate response.
     *
     * @return The ResponseEntity<List<EnrichedArticle>> if the corresponding List<Article> can be retrieved from
     *         the database, or the appropriate response otherwise
     */
    @RequestMapping("/articles")
    public ResponseEntity<List<EnrichedArticle>> getEnrichedArticles() {
        // TODO by candidate (if enough time) --->

        return null; // TODO <---
    }

    @RequestMapping(value = "/articles", method = RequestMethod.POST) // @PostMapping("/articles")
    public void addArticle(@RequestBody Article article) {
        articleService.addArticle(article);
    }
    @RequestMapping(value = "/articles", method = RequestMethod.PUT) // @PutMapping("/articles")
    public void updateArticle(@RequestBody Article article) {
        articleService.updateArticle(article);
    }
    @RequestMapping(value = "/articles/{id}", method = RequestMethod.DELETE) // @DeleteMapping("/articles/{id}")
    public void deleteArticle(@PathVariable String id) {
        articleService.deleteArticle(id);
    }


}
