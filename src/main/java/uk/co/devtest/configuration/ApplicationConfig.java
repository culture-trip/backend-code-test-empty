package uk.co.devtest.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import uk.co.devtest.client.ExternalServiceClient;

@Configuration
public class ApplicationConfig {

    @Bean
    public ExternalServiceClient externalServiceClient(@Value("${external-service.base-url}") String externalServiceBaseUrl) {
        // TODO by candidate --->

        return null; // TODO <---
    }

}
