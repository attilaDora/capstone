package de.neuefische.backend.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CocktailApiResponse {
    private List<CocktailDto> drinks;

}