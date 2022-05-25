package de.neuefische.backend.service;

import de.neuefische.backend.model.Cocktail;
import de.neuefische.backend.repository.CocktailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CocktailService {
    private final CocktailRepository cocktailRepository;

    @Autowired
    public CocktailService(CocktailRepository cocktailRepository){
        this.cocktailRepository = cocktailRepository;
    }

    public List<Cocktail> getAllCocktails() { return cocktailRepository.findAll();}

}
