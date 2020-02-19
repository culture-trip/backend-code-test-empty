package uk.co.devtest.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Response;
import uk.co.devtest.client.ExternalServiceClient;
import uk.co.devtest.model.Article;

import java.io.IOException;
import java.util.Optional;

@Slf4j
@Service
public class ExternalService {

    private final ExternalServiceClient externalServiceClient;

    @Autowired
    public ExternalService(ExternalServiceClient externalServiceClient) {
        this.externalServiceClient = externalServiceClient;
    }

    /**
     * Returns an Optional with the Article retrieved from the ExternalService, or empty.
     * In case of exception the corresponding error is logged.
     *
     * @param id    The given article Id
     * @return      An Optional that will contain the Article retrieved from the ExternalService, or empty
     *              if the ExternalService does not provide the article or if there is an IOException
     */
    public Optional<Article> getArticle(String id) {
        // TODO by candidate --->

        return null; // TODO <---
    }

}
