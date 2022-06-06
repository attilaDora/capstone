import './CocktailRecipe.css';
import {Cocktail} from "../model/Cocktail";
import * as React from "react";
import {Button} from "@mui/material";
import {Favourite} from "../model/Favourite";

type CocktailRecipeProps = {
    cocktail: Cocktail
    addFavourite: (favourite: Favourite) => void
}

export default function CocktailRecipe( { cocktail,addFavourite} : CocktailRecipeProps ){

    return <div className="cocktail-recipe_" >
        <div className="cocktail-recipe_card" >
        <div className="wrapper">
            <div className="box a">{cocktail.name}<Button variant="text" onClick={()=> addFavourite(cocktail)}>Add to favorites</Button></div>
            <div className="box b"><img className="cocktail-recipe_image" src={cocktail.imageUrl} alt={cocktail.name}/></div>
            <div className="box c"><h3>Glass type:</h3> {cocktail.glass}</div>
            <div className="box d"><h3>Ingredients:</h3> {cocktail.measure1} {cocktail.ingredient1}<br/>
                {cocktail.ingredient2 !== null ? <p>  {cocktail.measure2 +" "+ cocktail.ingredient2} <br/> </p>: ""}
                {cocktail.ingredient3 !== null ? <p> {cocktail.measure3 +" "+ cocktail.ingredient3} <br/> </p>: ""}
                {cocktail.ingredient4 !== null ? <p> {cocktail.measure4 +" "+ cocktail.ingredient4} <br/> </p>: ""}
                {cocktail.ingredient5 !== null ? <p> {cocktail.measure5 +" "+ cocktail.ingredient5} <br/> </p>: ""}
                {cocktail.ingredient6 !== null ? <p> {cocktail.measure6 +" "+ cocktail.ingredient6} <br/> </p>: ""}
                {cocktail.ingredient7 !== null ? <p> {cocktail.measure7 +" "+ cocktail.ingredient7} <br/> </p>: ""}
                {cocktail.ingredient8 !== null ? <p> {cocktail.measure8 +" "+ cocktail.ingredient8} <br/> </p>: ""}
                {cocktail.ingredient9 !== null ? <p> {cocktail.measure9 +" "+ cocktail.ingredient9} <br/> </p>: ""}
                {cocktail.ingredient10 !== null ? <p> {cocktail.measure10 +" "+ cocktail.ingredient10} <br/> </p>: ""}
                {cocktail.ingredient11 !== null ? <p> {cocktail.measure11 +" "+ cocktail.ingredient11} <br/> </p>: ""}
                {cocktail.ingredient12 !== null ? <p> {cocktail.measure12 +" "+ cocktail.ingredient12} <br/> </p>: ""}
                {cocktail.ingredient13 !== null ? <p> {cocktail.measure13 +" "+ cocktail.ingredient13} <br/> </p>: ""}
                {cocktail.ingredient14 !== null ? <p> {cocktail.measure14 +" "+ cocktail.ingredient14} <br/> </p>: ""}
                {cocktail.ingredient15 !== null ? <p> {cocktail.measure15 +" "+ cocktail.ingredient15} <br/> </p>: ""}
            </div>
            <div className="box e">{cocktail.instructions}</div>

        </div></div>
    </div>

}
