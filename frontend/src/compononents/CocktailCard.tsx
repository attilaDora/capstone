import {Cocktail} from "../model/Cocktail";
import './CocktailCard.css'

type CocktailCardProps = {
    cocktail : Cocktail
}

export default function CocktailCard( { cocktail } : CocktailCardProps){

    return <div className="cocktail-card">
        <h3 className="name">{cocktail.strDrink}</h3>
        <img className="image" src={cocktail.strDrinkThumb} alt={cocktail.strDrink}/>
    </div>
}