package de.neuefische.backend.controller;

import de.neuefische.backend.model.Cocktail;
import de.neuefische.backend.service.CocktailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cocktail")
public class CocktailController {
    private final CocktailService cocktailService;

    @Autowired
    public CocktailController(CocktailService cocktailService) {this.cocktailService = cocktailService;}


    @GetMapping()
    public List<Cocktail> getAllCocktails() {return cocktailService.getAllCocktails();}
}
