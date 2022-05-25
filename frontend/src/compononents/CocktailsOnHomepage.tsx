import {Cocktail} from "../model/Cocktail";
import CocktailCard from "./CocktailCard";
import './CocktailsOnHomepage.css';

type CocktailsOnHomepageProps = {
    cocktails : Cocktail []
}

export default function CocktailsOnHomepage({cocktails}: CocktailsOnHomepageProps){

    return (

        <div className="cocktails-on-homepage">
            {cocktails.map((cocktail) => <CocktailCard key={cocktail.id} cocktail={cocktail}/> )}
        </div>
    )
}