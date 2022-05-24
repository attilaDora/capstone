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
    private String glass;
    @JsonProperty("strDrinkThumb")
    private String image;

    @JsonProperty("strInstructions")
    private String instructions;
    @JsonProperty("strInstructionsES")
    private String instructionsES;
    @JsonProperty("strInstructionsDE")
    private String instructionsDE;
    @JsonProperty("strInstructionsFR")
    private String instructionsFR;
    @JsonProperty("strInstructionsIT")
    private String instructionsIT;

    @JsonProperty("strIngredients")
    private String ingredients;
    @JsonProperty("strIngredients2")
    private String ingredients2;
    @JsonProperty("strIngredients3")
    private String ingredients3;
    @JsonProperty("strIngredients4")
    private String ingredients4;
    @JsonProperty("strIngredients5")
    private String ingredients5;
    @JsonProperty("strIngredients6")
    private String ingredients6;
    @JsonProperty("strIngredients7")
    private String ingredients7;
    @JsonProperty("strIngredients8")
    private String ingredients8;
    @JsonProperty("strIngredients9")
    private String ingredients9;
    @JsonProperty("strIngredients10")
    private String ingredients10;
    @JsonProperty("strIngredients11")
    private String ingredients11;
    @JsonProperty("strIngredients12")
    private String ingredients12;
    @JsonProperty("strIngredients13")
    private String ingredients13;
    @JsonProperty("strIngredients14")
    private String ingredients14;
    @JsonProperty("strIngredients15")
    private String ingredients15;

    @JsonProperty("strMeasure")
    private String measure;
    @JsonProperty("strMeasure2")
    private String measure2;
    @JsonProperty("strMeasure3")
    private String measure3;
    @JsonProperty("strMeasure4")
    private String measure4;
    @JsonProperty("strMeasure5")
    private String measure5;
    @JsonProperty("strMeasure6")
    private String measure6;
    @JsonProperty("strMeasure7")
    private String measure7;
    @JsonProperty("strMeasure8")
    private String measure8;
    @JsonProperty("strMeasure9")
    private String measure9;
    @JsonProperty("strMeasure10")
    private String measure10;
    @JsonProperty("strMeasure11")
    private String measure11;
    @JsonProperty("strMeasure12")
    private String measure12;
    @JsonProperty("strMeasure13")
    private String measure13;
    @JsonProperty("strMeasure14")
    private String measure14;
    @JsonProperty("strMeasure15")
    private String measure15;

}
