package de.neuefische.backend.controller;

import de.neuefische.backend.api.ApiCocktail;
import de.neuefische.backend.service.RandomCocktailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("random")
public class RandomCocktailController {
    private final RandomCocktailService randomCocktailService;

    @Autowired
    public RandomCocktailController(RandomCocktailService randomCocktailService) {this.randomCocktailService = randomCocktailService;}

    @GetMapping()
    public ApiCocktail getRandomCocktail() {
        return randomCocktailService.getRandomCocktail();
    }
}