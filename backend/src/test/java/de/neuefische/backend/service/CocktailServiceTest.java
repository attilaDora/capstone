package de.neuefische.backend.service;

import de.neuefische.backend.model.Cocktail;
import de.neuefische.backend.repository.CocktailRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CocktailServiceTest {
    private final CocktailRepository cocktailRepository = mock(CocktailRepository.class);
    private final CocktailService cocktailService = new CocktailService(cocktailRepository);

    @Test
    void getCocktails(){
        //GIVEN
        Cocktail cocktail1 = Cocktail
                .builder()
                .id("123")
                .name("Cocktail1")
                .build();
        Cocktail cocktail2 = Cocktail
                .builder()
                .id("2")
                .name("Cocktail2")
                .build();
        when(cocktailRepository.findAll()).thenReturn(List.of(cocktail1,cocktail2));
        //WHEN
        List<Cocktail> actual = cocktailService.getCocktails();
        //THEN
        List<Cocktail> expected = List.of(cocktail1,cocktail2);
        verify(cocktailRepository).findAll();
        assertEquals(expected, actual);
    }


}