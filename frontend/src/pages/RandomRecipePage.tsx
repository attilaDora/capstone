import useRandomCocktail from "../hooks/useRandomCocktail";
import CocktailRecipe from "../compononents/CocktailRecipe";
import {Favourite} from "../model/Favourite";
import {ShoppingItem} from "../model/ShoppingItem";

type RandomRecipePageProps = {
    addFavourite : (favourite: Favourite) => void
    deleteFavourite : (id: string) => void
    addShoppingItem: (shoppingItem: Omit<ShoppingItem, "id">) => void
}

export default function RandomRecipePage({ addFavourite, deleteFavourite, addShoppingItem } : RandomRecipePageProps){
    const {randomCocktail} = useRandomCocktail()
    return (<div>
    {randomCocktail && <CocktailRecipe cocktail={randomCocktail} addFavourite={addFavourite} deleteFavourite={deleteFavourite} addShoppingItem={addShoppingItem} />}
</div>)
}