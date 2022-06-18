package de.neuefische.backend.service;

import de.neuefische.backend.dto.CreateShoppingItemDto;
import de.neuefische.backend.model.ShoppingItem;
import de.neuefische.backend.repository.ShoppingItemsRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ShoppingItemsServiceTest {
    private final ShoppingItemsRepository shoppingItemsRepository = mock(ShoppingItemsRepository.class);
    private final ShoppingItemsService shoppingItemsService = new ShoppingItemsService(shoppingItemsRepository);

    ShoppingItem bier() {
        return ShoppingItem.builder()
                .id("123")
                .name("Bier")
                .build();
    }

    ShoppingItem vodka() {
        return ShoppingItem.builder()
                .id("321")
                .name("Vodka")
                .build();
    }

    ShoppingItem itemToAdd() {
        return ShoppingItem.builder()
                .name("Orange-juice")
                .build();
    }

    CreateShoppingItemDto newItemDto() {
        return CreateShoppingItemDto.builder()
                .name("Orange-juice")
                .build();
    }

    @Test
    void getShoppingItems() {
        //GIVEN
        when(shoppingItemsRepository.findAll()).thenReturn(List.of(bier(), vodka()));
        //WHEN

        List<ShoppingItem> actual = shoppingItemsService.getShoppingItems();

        //THEN
        List<ShoppingItem> expected = List.of(
                ShoppingItem.builder()
                        .id("123")
                        .name("Bier")
                        .build(),
                ShoppingItem.builder()
                        .id("321")
                        .name("Vodka")
                        .build());

        verify(shoppingItemsRepository).findAll();
        assertEquals(expected, actual);
    }

    @Test
    void addNewItem() {
        //GIVEN
        when(shoppingItemsRepository.insert(itemToAdd())).thenReturn(ShoppingItem.builder()
                .id("123")
                .name("Bier")
                .build());

        //WHEN
        ShoppingItem actual = shoppingItemsService.addNewShoppingItem(newItemDto());

        //THEN
        ShoppingItem expected = ShoppingItem.builder()
                .id("123")
                .name("Bier")
                .build();
        verify(shoppingItemsRepository).insert(itemToAdd());
        assertEquals(expected, actual);
    }
    @Test
    void deleteShoppingItemById() {
        //WHEN
        shoppingItemsService.deleteShoppingItems("1");
        //THEN
        verify(shoppingItemsRepository).deleteById("1");
    }
}
