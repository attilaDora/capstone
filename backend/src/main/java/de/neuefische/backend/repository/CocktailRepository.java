package de.neuefische.backend.repository;

import de.neuefische.backend.model.Cocktail;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CocktailRepository {
    Map<String, Cocktail> cocktails = new HashMap<>();


}

