package de.neuefische.backend.repository;

import de.neuefische.backend.model.Cocktail;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CocktailRepository {
    Map<String, Cocktail> cocktails = new HashMap<>();

}

