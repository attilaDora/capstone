package de.neuefische.backend.repository;

import de.neuefische.backend.model.Favourite;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavouriteRepository extends MongoRepository<Favourite, String>{
}
