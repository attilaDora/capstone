package de.neuefische.backend.controller;

import de.neuefische.backend.model.Cocktail;
import de.neuefische.backend.repository.CocktailRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CocktailControllerTest {
    @Autowired
    private CocktailRepository cocktailRepository;
    @Autowired
    private WebTestClient webTestClient;

    @Test
    void getCocktails(){
        //GIVEN
        Cocktail cocktail1 = Cocktail
                .builder()
                .id("123")
                .name("Cocktail1")
                .build();
        Cocktail cocktail2 = Cocktail
                .builder()
                .id("321")
                .name("Cocktail2")
                .build();
        cocktailRepository.insert(cocktail1);
        cocktailRepository.insert(cocktail2);
        //WHEN
        List<Cocktail> actual = webTestClient.get()
                .uri("cocktail")
                .exchange()
                .expectStatus().is2xxSuccessful()
                .expectBodyList(Cocktail.class)
                .returnResult()
                .getResponseBody();
        //THEN
        List<Cocktail> expected = List.of(Cocktail
                        .builder()
                        .id("123")
                        .name("Cocktail1")
                        .build(),
                Cocktail
                        .builder()
                        .id("321")
                        .name("Cocktail2")
                        .build());
        assertEquals(expected,actual);
    }

}