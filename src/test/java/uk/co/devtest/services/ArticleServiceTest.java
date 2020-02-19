package uk.co.devtest.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import uk.co.devtest.model.Article;
import uk.co.devtest.repository.ArticleRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class ArticleServiceTest {

    private static final String FAKE_ID = "Fake-id";
    private static final String FAKE_TITLE = "Fake-title";
    private static final String FAKE_CONTENT = "Fake-content";

    @MockBean
    ArticleRepository articleRepository;

    ArticleService articleService;

    @BeforeEach
    void setUp() {
        articleService = new ArticleService(articleRepository);
    }

    @Test
    void getArticle_returnsNullIfTheArticleDoesNotExistInTheDatabase() {
        // GIVEN
        when(articleRepository.findById(anyString())).thenReturn(Optional.empty());

        // WHEN
        Article actual = articleService.getArticleById("nonExistingArticleId");

        // THEN
        assertNull(actual);
    }

    @Test
    void getArticle_returnsExistingArticleInTheDatabase() {
        // GIVEN
        String articleId = FAKE_ID;
        Article expected = new Article(articleId, FAKE_TITLE, FAKE_CONTENT);
        when(articleRepository.findById(articleId)).thenReturn(Optional.of(expected));

        // WHEN
        Article actual = articleService.getArticleById(articleId);

        // THEN
        assertEquals(expected, actual);
    }
}
