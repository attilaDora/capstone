import {useEffect, useState} from "react";
import {Favourite} from "../model/Favourite";
import {getFavourites, postFavourite, removeFavourite} from "../service/CocktailsApiService";

export default function useFavourite(){
    const [favouriteCocktails, setFavouriteCocktails] = useState<Favourite[]>([])

    useEffect(()=>{
        getFavourites()
            .then(favouriteCocktails => setFavouriteCocktails(favouriteCocktails))
            .catch(()=> console.error("Can't show any Cocktails"))
    }, [])

    const addFavourite =  (favourite : Favourite) =>{
        postFavourite(favourite)
            .then((favourite)=> setFavouriteCocktails([...favouriteCocktails, favourite]))
    }

    const deleteFavourite =  (id:string) => {
        removeFavourite(id)
            .then(() => setFavouriteCocktails(favouriteCocktails.filter(favouriteCocktail => favouriteCocktail.id !==id)))
            .catch(() => console.error())
    }

    return{
        addFavourite, favouriteCocktails, deleteFavourite
    }

}