package de.neuefische.backend;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    public WebClient getWebClient() {
        return WebClient.create("https://www.thecocktaildb.com/api/json/v2/9973533/filter.php?a=Alcoholic");
    }
}
