package de.neuefische.backend.service;

import de.neuefische.backend.model.Favourite;
import de.neuefische.backend.repository.FavouriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavouriteService {
    private final FavouriteRepository favouriteRepository;

    @Autowired
    public FavouriteService(FavouriteRepository favouriteRepository) {this.favouriteRepository=favouriteRepository;}

    public List<Favourite> getFavourites(){
        return favouriteRepository.findAll();
    }

    public Favourite addFavourite(Favourite favourite){
        Favourite addFavourite = new Favourite();
        addFavourite.setId(favourite.getId());
        addFavourite.setName(favourite.getName());
        addFavourite.setImageUrl(favourite.getImageUrl());
        return favouriteRepository.insert(addFavourite);
    }
    public void deleteFavourite(String id){favouriteRepository.deleteById(id);}
}
