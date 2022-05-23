package de.neuefische.backend.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CocktailDto {
    @JsonProperty("idDrink")
    private String id;
    @JsonProperty("StrDrink")
    private String name;
    @JsonProperty("strGlass")
    String glass;
    @JsonProperty("strDrinkThumb")
    String image;

    @JsonProperty("strInstructions")
    String instructions;
    @JsonProperty("strInstructionsES")
    String instructionsES;
    @JsonProperty("strInstructionsDE")
    String instructionsDE;
    @JsonProperty("strInstructionsFR")
    String instructionsFR;
    @JsonProperty("strInstructionsIT")
    String instructionsIT;

    @JsonProperty("strIngredients")
    String ingredients;
    @JsonProperty("strIngredients2")
    String ingredients2;
    @JsonProperty("strIngredients3")
    String ingredients3;
    @JsonProperty("strIngredients4")
    String ingredients4;
    @JsonProperty("strIngredients5")
    String ingredients5;
    @JsonProperty("strIngredients6")
    String ingredients6;
    @JsonProperty("strIngredients7")
    String ingredients7;
    @JsonProperty("strIngredients8")
    String ingredients8;
    @JsonProperty("strIngredients9")
    String ingredients9;
    @JsonProperty("strIngredients10")
    String ingredients10;
    @JsonProperty("strIngredients11")
    String ingredients11;
    @JsonProperty("strIngredients12")
    String ingredients12;
    @JsonProperty("strIngredients13")
    String ingredients13;
    @JsonProperty("strIngredients14")
    String ingredients14;
    @JsonProperty("strIngredients15")
    String ingredients15;

    @JsonProperty("strMeasure")
    String measure;
    @JsonProperty("strMeasure2")
    String measure2;
    @JsonProperty("strMeasure3")
    String measure3;
    @JsonProperty("strMeasure4")
    String measure4;
    @JsonProperty("strMeasure5")
    String measure5;
    @JsonProperty("strMeasure6")
    String measure6;
    @JsonProperty("strMeasure7")
    String measure7;
    @JsonProperty("strMeasure8")
    String measure8;
    @JsonProperty("strMeasure9")
    String measure9;
    @JsonProperty("strMeasure10")
    String measure10;
    @JsonProperty("strMeasure11")
    String measure11;
    @JsonProperty("strMeasure12")
    String measure12;
    @JsonProperty("strMeasure13")
    String measure13;
    @JsonProperty("strMeasure14")
    String measure14;
    @JsonProperty("strMeasure15")
    String measure15;

}
