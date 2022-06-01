package de.neuefische.backend.controller;

import de.neuefische.backend.model.Favourite;
import de.neuefische.backend.repository.FavouriteRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class FavouriteControllerTest {

    @Autowired
    private WebTestClient webTestClient;
    @Autowired
    private FavouriteRepository favouriteRepository;
    @BeforeEach
    public void clean(){favouriteRepository.deleteAll();}

    @Test
    void getFavorites(){
        //GIVEN
        Favourite favourite1 = Favourite
                .builder()
                .id("123")
                .name("Favourite1")
                .build();
        Favourite favourite2 = Favourite
                .builder()
                .id("321")
                .name("Favourite2")
                .build();
        favouriteRepository.insert(favourite1);
        favouriteRepository.insert(favourite2);
        //WHEN
        List<Favourite> actual = webTestClient.get()
                .uri("favourite")
                .exchange()
                .expectStatus().is2xxSuccessful()
                .expectBodyList(Favourite.class)
                .returnResult()
                .getResponseBody();
        //THEN
        List<Favourite> expected = List.of(Favourite
                        .builder()
                        .id("123")
                        .name("Favourite1")
                        .build(),
                Favourite
                        .builder()
                        .id("321")
                        .name("Favourite2")
                        .build());
        assertEquals(expected,actual);
    }
    @Test
    void addFavourite(){
        //GIVEN
        Favourite addFavourite = Favourite
                .builder()
                .name("Favourite1")
                .imageUrl("test.com")
                .id("123")
                .build();
        //WHEN
        Favourite actual = webTestClient.post()
                .uri("favourite")
                .bodyValue(addFavourite)
                .exchange()
                .expectStatus().is2xxSuccessful()
                .expectBody(Favourite.class)
                .returnResult()
                .getResponseBody();
        //THEN
        Favourite expected = Favourite
                .builder()
                .id("123")
                .name("Favourite1")
                .imageUrl("test.com")
                .build();
        assertEquals(expected, actual);
    }
}

