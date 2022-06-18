import {useEffect, useState} from "react";
import {Cocktail} from "../model/Cocktail";
import {getCocktailById} from "../service/CocktailsApiService";

export default function useCocktailRecipe(id:string | undefined){

    const[cocktailRecipe, setCocktailRecipe] = useState<Cocktail>();
    useEffect(() => {
        if (id){
            getCocktailBy(id)
        }
    }, [id])
    const getCocktailBy = (id:string) => {
        getCocktailById(id)
            .then(data => setCocktailRecipe(data))

    }

    return {cocktailRecipe}
}