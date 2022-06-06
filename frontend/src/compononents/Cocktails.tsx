import {Cocktail} from "../model/Cocktail";
import CocktailCard from "./CocktailCard";
import './Cocktails.css';

type CocktailsOnHomepageProps = {
    cocktails : Cocktail []
}

export default function Cocktails({cocktails}: CocktailsOnHomepageProps){

    return (

        <div className="cocktails">
            {cocktails.map((cocktail) => <CocktailCard key={cocktail.id} cocktail={cocktail}/> )}
        </div>
    )
}