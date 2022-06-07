import {useParams} from "react-router-dom";
import CocktailRecipe from "../compononents/CocktailRecipe";
import useCocktailRecipe from "../hooks/useCocktailRecipe";
import {Favourite} from "../model/Favourite";

type CocktailRecipeProps = {
    addFavourite : (favourite: Favourite) => void
    deleteFavourite : (id: string) => void
}

export default function CocktailRecipePage( { addFavourite, deleteFavourite} : CocktailRecipeProps ) {

    const params = useParams()
    const id = params.id
    const {cocktailRecipe} = useCocktailRecipe(id)

    return (
        <div>
            {cocktailRecipe && <CocktailRecipe cocktail={cocktailRecipe} addFavourite={addFavourite} deleteFavourite={deleteFavourite}/>}
        </div>
    )
}