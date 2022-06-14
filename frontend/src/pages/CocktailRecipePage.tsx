import {useParams} from "react-router-dom";
import CocktailRecipe from "../compononents/CocktailRecipe";
import useCocktailRecipe from "../hooks/useCocktailRecipe";
import {Favourite} from "../model/Favourite";
import {ShoppingItem} from "../model/ShoppingItem";

type CocktailRecipeProps = {
    addFavourite : (favourite: Favourite) => void
    deleteFavourite : (id: string) => void
    addShoppingItem: (shoppingItem:ShoppingItem) => void
}

export default function CocktailRecipePage( { addFavourite, deleteFavourite, addShoppingItem } : CocktailRecipeProps ) {

    const params = useParams()
    const id = params.id
    const {cocktailRecipe} = useCocktailRecipe(id)

    return (
        <div>
            {cocktailRecipe && <CocktailRecipe cocktail={cocktailRecipe} addFavourite={addFavourite} deleteFavourite={deleteFavourite} addShoppingItem={addShoppingItem} />}
        </div>
    )
}