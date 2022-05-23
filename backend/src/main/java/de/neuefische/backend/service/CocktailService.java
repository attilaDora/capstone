package de.neuefische.backend.service;

import de.neuefische.backend.api.CocktailApiService;
import de.neuefische.backend.repository.CocktailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CocktailService {
    private final CocktailRepository cocktailRepository;
    private final CocktailApiService cocktailApiService;

    @Autowired
    public CocktailService(CocktailRepository cocktailRepository, CocktailApiService cocktailApiService){
        this.cocktailRepository = cocktailRepository;
        this.cocktailApiService = cocktailApiService;
    }

}
