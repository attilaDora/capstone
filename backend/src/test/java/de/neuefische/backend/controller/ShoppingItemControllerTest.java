package de.neuefische.backend.controller;

import de.neuefische.backend.model.Favourite;
import de.neuefische.backend.model.ShoppingItem;
import de.neuefische.backend.repository.ShoppingItemsRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ShoppingItemControllerTest {

    @Autowired
    private WebTestClient webTestClient;
    @Autowired
    private ShoppingItemsRepository shoppingItemsRepository;
    @BeforeEach
    public void clean(){shoppingItemsRepository.deleteAll();}


    @Test
    void getShoppingItem() {
        //GIVEN
        ShoppingItem shoppingItem1 = ShoppingItem
                .builder()
                .id("123")
                .name("shoppingItem1")
                .build();
        ShoppingItem shoppingItem2 = ShoppingItem
                .builder()
                .id("321")
                .name("shoppingItem2")
                .build();
        shoppingItemsRepository.insert(shoppingItem1);
        shoppingItemsRepository.insert(shoppingItem2);
        //WHEN
        List<ShoppingItem> actual = webTestClient.get()
                .uri("shoppingitem")
                .exchange()
                .expectStatus().is2xxSuccessful()
                .expectBodyList(ShoppingItem.class)
                .returnResult()
                .getResponseBody();
        //THEN
        List<ShoppingItem> expected = List.of(ShoppingItem
                        .builder()
                        .id("123")
                        .name("shoppingItem1")
                        .build(),
                ShoppingItem
                        .builder()
                        .id("321")
                        .name("shoppingItem2")
                        .build());
        assertEquals(expected, actual);
    }
    @Test
    void addShoppingItem(){
        //GIVEN
        ShoppingItem addShoppingItem = ShoppingItem
                .builder()
                .name("shoppingItem1")
                .build();
        //WHEN
        ShoppingItem actual = webTestClient.post()
                .uri("shoppingitem")
                .bodyValue(addShoppingItem)
                .exchange()
                .expectStatus().is2xxSuccessful()
                .expectBody(ShoppingItem.class)
                .returnResult()
                .getResponseBody();
        //THEN
        ShoppingItem expected = ShoppingItem
                .builder()
                .name("shoppingItem1")
                .id(actual.getId())
                .build();
        assertEquals(expected, actual);
    }

    @Test
    void deleteShoppingItem() {
        //GIVEN
        ShoppingItem addShoppingItem = ShoppingItem
                .builder()
                .name("ShoppingItem")
                .id("123")
                .build();
        ShoppingItem addedShoppingItem = webTestClient.post()
                .uri("shoppingitem")
                .bodyValue(addShoppingItem)
                .exchange()
                .expectStatus().is2xxSuccessful()
                .expectBody(ShoppingItem.class)
                .returnResult()
                .getResponseBody();

        //WHEN
        assertNotNull(addedShoppingItem);
        webTestClient.delete()
                .uri("/shoppingitem/" + addedShoppingItem.getId())
                .exchange()

                //THEN

                .expectStatus().is2xxSuccessful();
    }
}

