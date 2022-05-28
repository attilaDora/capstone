package de.neuefische.backend.service;

import de.neuefische.backend.api.ApiCocktail;
import de.neuefische.backend.api.CocktailApiService;
import de.neuefische.backend.api.CocktailDto;
import de.neuefische.backend.model.Cocktail;
import de.neuefische.backend.repository.CocktailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CocktailService {
    private final CocktailRepository cocktailRepository;
    private final  CocktailApiService cocktailApiService;


    @Autowired
    public CocktailService(CocktailRepository cocktailRepository, CocktailApiService cocktailApiService){
        this.cocktailRepository = cocktailRepository;
        this.cocktailApiService = cocktailApiService;
    }

    public List<Cocktail> getCocktails() { return cocktailRepository.findAll();}

    public ApiCocktail getCocktailById(String id){
        CocktailDto dto = cocktailApiService.retrieveCocktailById(id);
    return ApiCocktail.builder()
            .id(dto.getId())
            .name(dto.getName())
            .glass(dto.getGlass())
            .imageUrl(dto.getImageUrl())
            .ingredient1(dto.getIngredient1())
            .ingredient2(dto.getIngredient2())
            .ingredient3(dto.getIngredient3())
            .ingredient4(dto.getIngredient4())
            .ingredient5(dto.getIngredient5())
            .ingredient6(dto.getIngredient6())
            .ingredient7(dto.getIngredient7())
            .ingredient8(dto.getIngredient8())
            .ingredient9(dto.getIngredient9())
            .ingredient10(dto.getIngredient10())
            .ingredient11(dto.getIngredient11())
            .ingredient12(dto.getIngredient12())
            .ingredient13(dto.getIngredient13())
            .ingredient14(dto.getIngredient14())
            .ingredient15(dto.getIngredient15())
            .measure1(dto.getMeasure1())
            .measure2(dto.getMeasure2())
            .measure3(dto.getMeasure3())
            .measure4(dto.getMeasure4())
            .measure5(dto.getMeasure5())
            .measure6(dto.getMeasure6())
            .measure7(dto.getMeasure7())
            .measure8(dto.getMeasure8())
            .measure9(dto.getMeasure9())
            .measure10(dto.getMeasure10())
            .measure11(dto.getMeasure11())
            .measure12(dto.getMeasure12())
            .measure13(dto.getMeasure13())
            .measure14(dto.getMeasure14())
            .measure15(dto.getMeasure15())
            .instructions(dto.getInstructions())
            .instructionsES(dto.getInstructionsES())
            .instructionsDE(dto.getInstructionsDE())
            .instructionsFR(dto.getInstructionsFR())
            .instructionsIT(dto.getInstructionsIT())

            .build();
    }

}
