package uk.co.devtest.exception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import uk.co.devtest.controller.ArticleController;
import uk.co.devtest.services.ArticleService;
import uk.co.devtest.services.ExternalService;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@ExtendWith(SpringExtension.class)
public class CustomExceptionHandlerTest {

    private static final String FAKE_ID = "1234";
    private static final String FORBIDDEN_EXCEPTION_MESSAGE = "Forbidden exception";
    private static final String UNKNOWN_EXCEPTION_MESSAGE = "Unknown exception";

    @MockBean
    ArticleService articleService;

    @MockBean
    ExternalService externalService;

    ArticleController articleController;

    private MockMvc mockMvc;

    @BeforeEach
    public void setUp() {
        articleController = new ArticleController(articleService, externalService);
        mockMvc = standaloneSetup(articleController).setControllerAdvice(new CustomExceptionHandler()).build();
    }

    // TODO by candidate ---> Provide the required tests for the ExceptionHandler. E.g.:
    // - When requesting the endpoint "/articles/{id}" the possible Exceptions are handled

    // TODO <---

}
