package de.neuefische.backend.controller;

import de.neuefische.backend.model.Favourite;
import de.neuefische.backend.service.FavouriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("favourite")
public class FavouriteController {
    private final FavouriteService favouriteService;

    @Autowired
    public FavouriteController(FavouriteService favouriteService){this.favouriteService = favouriteService;}

    @GetMapping
    public List<Favourite> getFavourites(){return favouriteService.getFavourites();}

    @PostMapping
    public Favourite addFavourite(@RequestBody Favourite favourite){ return favouriteService.addFavourite(favourite);}

    @DeleteMapping("{id}")
    public void deleteFavourite(@PathVariable String id) {favouriteService.deleteFavourite(id);}
}
