package de.neuefische.backend.controller;

import de.neuefische.backend.model.ShoppingItem;
import de.neuefische.backend.service.ShoppingItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("shoppingitem")
public class ShoppingItemController {
    private final ShoppingItemsService shoppingItemsService;

    @Autowired
    public ShoppingItemController(ShoppingItemsService shoppingItemsService) {
        this.shoppingItemsService = shoppingItemsService;
    }

    @GetMapping
    public List<ShoppingItem> getShoppingItems() {
        return shoppingItemsService.getShoppingItems();
    }

    @SuppressWarnings("java:S4684")
    @PostMapping
    public ShoppingItem addShoppingItem(@RequestBody ShoppingItem shoppingItem) {
        return shoppingItemsService.addShoppingItem(shoppingItem);
    }
    @DeleteMapping("{id}")
    public void deleteShoppingItems(@PathVariable String id) {shoppingItemsService.deleteShoppingItems(id);}
}
