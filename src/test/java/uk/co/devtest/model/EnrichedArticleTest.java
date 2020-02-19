package uk.co.devtest.model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnrichedArticleTest {

    private static final String FAKE_TITLE = "Fake-title";
    private static final String FAKE_CONTENT = "Fake-content";
    private static final String SEPARATOR = "~";

    @ParameterizedTest(name = "{index} => id={0}, cities={1}")
    @CsvSource({
            "1, Amsterdam" + SEPARATOR + "Beijing",
            "2, Lisbon" + SEPARATOR + "Melbourne" + SEPARATOR + "Tokyo",
            "3, Amsterdam" + SEPARATOR + "Dubai",
            "4, Dubai" + SEPARATOR + "Paris",
            "5, Amsterdam" + SEPARATOR + "Paris",
            "6, Paris" + SEPARATOR + "Tokyo",
            "7, New York City",
            "8, Beijing" + SEPARATOR + "Dubai" + SEPARATOR + "Melbourne" + SEPARATOR + "New York City" + SEPARATOR + "Rome",
            "9, Beijing" + SEPARATOR + "Rome",
            "1234, " + SEPARATOR
    })
    public void newEnrichedArticleHasTheCorrectCities(String id, String cities) {
        // GIVEN an Article
        Article article = new Article(id, FAKE_TITLE, FAKE_CONTENT);
        String[] expectedCities = cities.split(SEPARATOR);

        // WHEN the EnrichedArticle is created
        EnrichedArticle enrichedArticle = new EnrichedArticle(article);

        // THEN
        String[] actualCities = enrichedArticle.getReferencingCities().stream().toArray(String[] ::new);
        assertEquals(expectedCities.length, actualCities.length);
        for (int i=0; i<expectedCities.length; i++) {
            assertEquals(expectedCities[i], actualCities[i]);
        }
    }

}
