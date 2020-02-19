package uk.co.devtest.controller;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.google.gson.Gson;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import uk.co.devtest.model.Article;
import uk.co.devtest.model.EnrichedArticle;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// TODO annotations by candidate --->

// TODO <---
public class ArticleControllerIntegrationTest {

    private static final String FAKE_ID = "1234";
    private static final String FAKE_TITLE = "Fake-title";
    private static final String FAKE_CONTENT = "Fake-content";

    private static final int WIREMOCK_PORT = 8090;

    private static final Gson GSON = new Gson();

    private WireMockServer wireMockServer;

    @Autowired
    private MockMvc mvc;

    @BeforeEach
    public void setUp() {
        wireMockServer = new WireMockServer(WIREMOCK_PORT);
        wireMockServer.start();
    }

    @AfterEach
    public void teardown() {
        wireMockServer.stop();
    }

    // TODO by candidate ---> Provide the required tests for the Controller. E.g.:
    // - The endpoint "/articles/{id}" will return BadRequest if the provided Article Id is a blank string (" ")
    // - The endpoint "/articles/{id}" will return the EnrichedArticle built from the Article received from the ExternalService
    // - The endpoint "/articles/{id}" will return the EnrichedArticle built from the Article received from the DB when is not provided by the ExternalService
    // - The endpoint "/articles/{id}" will return NotFound if neither the EternalService nor the DB provide the Article
    //
    // Example of SQL script to annotate tests that may require it:
    // @Sql({"classpath:sql/delete_articles.sql", "classpath:sql/insert_fake_articles.sql"})

    // TODO <---

}
