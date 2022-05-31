package de.neuefische.backend.service;

import de.neuefische.backend.model.Favourite;
import de.neuefische.backend.repository.FavouriteRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FavouriteServiceTest {

    private final FavouriteRepository favouriteRepository = mock(FavouriteRepository.class);
    private final FavouriteService favouriteService = new FavouriteService(favouriteRepository);

    @Test
    void getFavourites(){
        //GIVEN
        Favourite favourite1 = Favourite
                .builder()
                .id("123")
                .name("cocktail1")
                .build();
        Favourite favourite2 = Favourite
                .builder()
                .id("234")
                .name("Cocktail2")
                .build();
        when(favouriteRepository.findAll()).thenReturn(List.of(favourite1, favourite2));
        //WHEN
        List<Favourite> actual = favouriteService.getFavourites();
        //THEN
        List<Favourite> expected = List.of(favourite1, favourite2);
        verify(favouriteRepository).findAll();
        assertEquals(expected, actual);
    }
    @Test
    void addFavourite() {
        //GIVEN
        Favourite addFavourite = Favourite
                .builder()
                .name("Favourite1")
                .build();
        when(favouriteRepository.insert(addFavourite)).thenReturn(Favourite
                .builder()
                .id("123")
                .name("Favourite1")
                .imageUrl("www.test.com")
                .build());
        //WHEN
        Favourite newFavourite = Favourite
                .builder()
                .name("Favourite1")
                .build();
        Favourite actual = favouriteService.addFavourite(newFavourite);
        //THEN
        Favourite expected = Favourite
                .builder()
                .id("123")
                .name("Favourite1")
                .imageUrl("www.test.com")
                .build();
        verify(favouriteRepository).insert(addFavourite);
        assertEquals(expected, actual);

    }

}