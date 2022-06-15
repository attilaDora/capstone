package de.neuefische.backend.repository;

import de.neuefische.backend.model.ShoppingItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingItemsRepository extends MongoRepository<ShoppingItem, String> {
}
