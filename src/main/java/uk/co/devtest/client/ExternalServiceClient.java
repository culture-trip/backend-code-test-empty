package uk.co.devtest.client;

import org.springframework.http.MediaType;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import uk.co.devtest.model.Article;

public interface ExternalServiceClient {
    @Headers("Content-Type: " + MediaType.APPLICATION_JSON_VALUE)
    @GET("/externalService/{id}")
    Call<Article> getArticle(@Path("id") String id);
}
