import {useEffect, useState} from "react";
import {Cocktail} from "../model/Cocktail";
import {getRandomCocktail} from "../service/CocktailsApiService";

export default function useRandomCocktail(){

    const[randomCocktail, setRandomCocktail] = useState<Cocktail>();
    useEffect(() => {
            getRandom()
    }, [])

    const getRandom = () => {
        getRandomCocktail()
            .then(data => setRandomCocktail(data))
    }
    return {randomCocktail}
}