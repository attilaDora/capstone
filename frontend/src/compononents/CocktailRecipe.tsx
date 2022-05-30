import './CocktailRecipe.css';
import {Cocktail} from "../model/Cocktail";
import * as React from "react";

type CocktailRecipeProps = {
    cocktail : Cocktail
}

export default function CocktailRecipe( { cocktail } : CocktailRecipeProps ){


    return <div className="cocktail-recipe_" >
        <div className="cocktail-recipe_card" >

        <div className="wrapper">
            <div className="box a">{cocktail.name}</div>
            <div className="box b"><img className="cocktail-recipe_image" src={cocktail.imageUrl} alt={cocktail.name}/></div>
            <div className="box c"><h3>Glass type:</h3> {cocktail.glass}</div>
            <div className="box d"><h3>Ingredients:</h3> {cocktail.measure1} {cocktail.ingredient1}
            <br/>{cocktail.measure2} {cocktail.ingredient2}<br/>
                {cocktail.measure3} {cocktail.ingredient3}<br/>
                {cocktail.measure4} {cocktail.ingredient4}<br/>
                {cocktail.measure5} {cocktail.ingredient5}<br/>
                {cocktail.measure6} {cocktail.ingredient6}<br/>
                {cocktail.measure7} {cocktail.ingredient7}<br/>
                {cocktail.measure8} {cocktail.ingredient8}<br/>
                {cocktail.measure9} {cocktail.ingredient9}<br/>
                {cocktail.measure10} {cocktail.ingredient10}<br/>
                {cocktail.measure11} {cocktail.ingredient11}<br/>
                {cocktail.measure12} {cocktail.ingredient12}<br/>
                {cocktail.measure13} {cocktail.ingredient13}<br/>
                {cocktail.measure14} {cocktail.ingredient14}<br/>
                {cocktail.measure15} {cocktail.ingredient15}<br/>
            </div>
            <div className="box e">{cocktail.instructions}</div>

        </div></div>
    </div>

}