import {Cocktail} from "../model/Cocktail";
import {useEffect, useState} from "react";
import {getAllCocktails} from "../service/CocktailsApiService";

export default function useCocktails() {
    const [cocktails, setCocktails] = useState<Cocktail[]>([]);

    useEffect(() => {
        getAllCocktails()
            .then((cocktails) => setCocktails(cocktails))
            .catch(() => "Unexpected error while loading the content!!")
    },[])

    return cocktails;
}
