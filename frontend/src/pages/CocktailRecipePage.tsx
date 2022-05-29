import {useParams} from "react-router-dom";
import CocktailRecipe from "../compononents/CocktailRecipe";
import useCocktailRecipe from "../hooks/useCocktailRecipe";
export default function CocktailRecipePage() {

    const params = useParams()
    const id = params.id
    const {cocktailRecipe} = useCocktailRecipe(id)

    return (
        <div>
            {cocktailRecipe && <CocktailRecipe cocktail={cocktailRecipe}/>}
        </div>
    )
}