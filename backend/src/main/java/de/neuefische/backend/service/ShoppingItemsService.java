package de.neuefische.backend.service;

import de.neuefische.backend.model.ShoppingItem;
import de.neuefische.backend.repository.ShoppingItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingItemsService {
    private final ShoppingItemsRepository shoppingItemsRepository;

    @Autowired
    public ShoppingItemsService(ShoppingItemsRepository shoppingItemsRepository) {
        this.shoppingItemsRepository = shoppingItemsRepository;
    }

    public List<ShoppingItem> getShoppingItems() {
        return shoppingItemsRepository.findAll();
    }

    public ShoppingItem addShoppingItem(ShoppingItem shoppingItem) {
        ShoppingItem addShoppingItem = new ShoppingItem();
        addShoppingItem.setId(shoppingItem.getId());
        addShoppingItem.setName(shoppingItem.getName());
        return shoppingItemsRepository.insert(addShoppingItem);
    }
    public void deleteShoppingItems(String id){shoppingItemsRepository.deleteById(id);}
}
