package de.neuefische.backend.api;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class RandomCocktailApiService {
    @Value("${capstone.api.key}")
    private String API_KEY;
    private final WebClient webClient;

    public RandomCocktailApiService(WebClient webClient) {
        this.webClient = webClient;
    }

    public CocktailDto retrieveRandomCocktail(){

        ResponseEntity<CocktailApiResponse> responseEntity = webClient.get()
                .uri("/api/json/v2/"+API_KEY+"/random.php")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .toEntity(CocktailApiResponse.class)
                .block();

        return responseEntity.getBody().getDrinks().get(0);
    }
}