package de.neuefische.backend.api;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class CocktailApiService {
    @Value("${capstone.api.key}")
    private String API_KEY;
    private final WebClient webClient;

    public CocktailApiService(WebClient webClient) {
        this.webClient = webClient;
    }

    public CocktailDto retrieveCocktailById(String id){

        ResponseEntity<CocktailDto> responseEntity = webClient.get()
                .uri("https://www.thecocktaildb.com/api/json/v2/"+API_KEY+"/lookup.php?i="+id)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .toEntity(CocktailDto.class)
                .block();

        return responseEntity.getBody();
    }
}
