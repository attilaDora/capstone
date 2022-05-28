import './CocktailRecipe.css';
import {Cocktail} from "../model/Cocktail";

type CocktailRecipeProps = {
    cocktail : Cocktail
}

export default function CocktailRecipe( { cocktail } : CocktailRecipeProps ){

    return <div className="character-details" >
        <div className="character-card" >
            <h3 className="character-card__name">Name: {cocktail.name}</h3>
            <img className="character-card__image" src={cocktail.imageUrl} alt={cocktail.name}/>
            {/*<div>Origin: {character.origin.name}</div>
            <div>Species: {character.species}</div>
            <div>Gender: {character.gender}</div>
            <div>Status: {character.status}</div>*/}
        </div>
    </div>
}
