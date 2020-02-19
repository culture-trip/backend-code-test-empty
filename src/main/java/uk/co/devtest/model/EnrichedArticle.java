package uk.co.devtest.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class EnrichedArticle {

    private static final Map<String, List<String>> CITY_REFS_MAP;
    static {
        Map<String, List<String>> cityRefsMap = new HashMap<>();
        cityRefsMap.put("Tokyo", Arrays.asList("2", "6"));
        cityRefsMap.put("Amsterdam", Arrays.asList("1", "3", "5"));
        cityRefsMap.put("New York City", Arrays.asList("7", "8"));
        cityRefsMap.put("Rome", Arrays.asList("8", "9"));
        cityRefsMap.put("Melbourne", Arrays.asList("2", "8"));
        cityRefsMap.put("Beijing", Arrays.asList("1", "8", "9"));
        cityRefsMap.put("Dubai", Arrays.asList("3", "4", "8"));
        cityRefsMap.put("Lisbon", Arrays.asList("2"));
        cityRefsMap.put("Paris", Arrays.asList("4", "5", "6"));
        CITY_REFS_MAP = Collections.unmodifiableMap(cityRefsMap);
    }

    private Article article;
    private Set<String> referencingCities;

    public EnrichedArticle(Article article) {
        this.article = article;
        this.referencingCities = generateReferencingCities(article.getId());
    }

    /**
     * Returns a sorted Set with the cities related to this article, according to the provided static map.
     * For example, given an Article with id="6", this method must return a Set containing "Paris" and "Tokyo",
     * but not "Tokyo" and "Paris", because the set must be sorted alphabetically.
     * @param id    the article id
     * @return      the sorted Set with the city names
     */
    private Set<String> generateReferencingCities(String id) {
        // TODO by candidate --->

        return null; // TODO <---
    }
}
