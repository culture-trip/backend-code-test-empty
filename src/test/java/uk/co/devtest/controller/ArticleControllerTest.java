package uk.co.devtest.controller;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import uk.co.devtest.exception.ForbiddenException;
import uk.co.devtest.exception.UnknownException;
import uk.co.devtest.model.Article;
import uk.co.devtest.model.EnrichedArticle;
import uk.co.devtest.services.ArticleService;
import uk.co.devtest.services.ExternalService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// TODO annotations by candidate --->

// TODO <---
public class ArticleControllerTest {

    private static final String FAKE_ID = "8";
    private static final String FAKE_TITLE = "Fake-title";
    private static final String FAKE_CONTENT = "Fake-content";

    private static final String FORBIDDEN_EXCEPTION_MESSAGE = "Forbidden exception";
    private static final String UNKNOWN_EXCEPTION_MESSAGE = "Unknown exception";

    private static final Gson GSON = new Gson();

    @MockBean
    private ArticleService articleService;

    @MockBean
    private ExternalService externalService;

    @Autowired
    private MockMvc mvc;

    // TODO by candidate ---> Provide the required tests for the Controller. E.g.:
    // - The endpoint "/articles/{id}" will return BadRequest if the provided Article Id is a blank string (" ")
    // - The endpoint "/articles/{id}" will return the EnrichedArticle built from the Article received from the ExternalService
    // - The endpoint "/articles/{id}" will return the EnrichedArticle built from the Article received from the DB when is not provided by the ExternalService
    // - The endpoint "/articles/{id}" will return NotFound if neither the EternalService nor the DB provide the Article
    // - Tests for possible Exceptions

    // TODO <---

}