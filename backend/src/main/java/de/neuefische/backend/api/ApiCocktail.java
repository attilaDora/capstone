package de.neuefische.backend.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiCocktail {
    private String id;

    private String name;
    private String glass;
    private String imageUrl;

    private String instructions;
    private String instructionsES;
    private String instructionsDE;
    private String instructionsFR;
    private String instructionsIT;

    private String ingredient1;
    private String ingredient2;
    private String ingredient3;
    private String ingredient4;
    private String ingredient5;
    private String ingredient6;
    private String ingredient7;
    private String ingredient8;
    private String ingredient9;
    private String ingredient10;
    private String ingredient11;
    private String ingredient12;
    private String ingredient13;
    private String ingredient14;
    private String ingredient15;

    private String measure1;
    private String measure2;
    private String measure3;
    private String measure4;
    private String measure5;
    private String measure6;
    private String measure7;
    private String measure8;
    private String measure9;
    private String measure10;
    private String measure11;
    private String measure12;
    private String measure13;
    private String measure14;
    private String measure15;

}
