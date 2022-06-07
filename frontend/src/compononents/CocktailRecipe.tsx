import './CocktailRecipe.css';
import {Cocktail} from "../model/Cocktail";
import * as React from "react";
import {Button} from "@mui/material";
import {Favourite} from "../model/Favourite";

type CocktailRecipeProps = {
    cocktail: Cocktail
    addFavourite: (favourite: Favourite) => void
    deleteFavourite: (favourite: string) => void
}

export default function CocktailRecipe({cocktail, addFavourite, deleteFavourite}: CocktailRecipeProps) {

    const allIngredients = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15].map(index => {
        // @ts-ignore
        const measure = cocktail["measure" + index];
        // @ts-ignore
        const ingredient = cocktail["ingredient" + index];
        if (measure === null || measure === undefined) return;
        if (ingredient === null || ingredient === undefined) return;
        return <p>  {measure + " " + ingredient} <br/></p>
    });

    return <div className="cocktail-recipe_">
        <div className="cocktail-recipe_card">
            <div className="wrapper">
                <div className="box a">{cocktail.name}<Button variant="text" onClick={() => addFavourite(cocktail)}>Add
                    to favorites</Button>
                    <Button variant="text" onClick={() => deleteFavourite(cocktail.id)}>Remove
                        from favorites</Button></div>
                <div className="box b"><img className="cocktail-recipe_image" src={cocktail.imageUrl}
                                            alt={cocktail.name}/></div>
                <div className="box c"><h3>Glass type:</h3> {cocktail.glass}</div>
                <div className="box d"><h3>Ingredients:</h3> {allIngredients}</div>
                <div className="box e">{cocktail.instructions}</div>
            </div>
        </div>
    </div>

}
