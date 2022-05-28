package de.neuefische.backend.repository;

import de.neuefische.backend.model.Cocktail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CocktailRepository extends MongoRepository<Cocktail, String> {
}
