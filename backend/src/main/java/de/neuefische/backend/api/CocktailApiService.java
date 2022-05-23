package de.neuefische.backend.api;

import de.neuefische.backend.WebClientConfig;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CocktailApiService {

    private final WebClientConfig webClientConfig;

    public CocktailApiService(WebClientConfig webClientConfig) {
        this.webClientConfig = webClientConfig;
    }

    @Value("${capstone.api.key}")
    private String API_KEY;

    public CocktailDto retrieveCocktailById(String id){

        ResponseEntity<CocktailDto> responseEntity = webClientConfig
                .getWebClient()
                .get()
                .uri("https://www.thecocktaildb.com/api/json/v2/"+API_KEY+"/lookup.php?i="+id)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .header("x-api-key", API_KEY)
                .retrieve()
                .toEntity(CocktailDto.class)
                .block();



        return responseEntity.getBody();
    }
}
