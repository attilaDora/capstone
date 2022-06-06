import {Favourite} from "../model/Favourite";
import Favourites from "../compononents/Favourites";

export type FavouriteCocktailsPageProps={
    favourites : Favourite[]
}
export default function FavouriteCocktailsPage({favourites}:FavouriteCocktailsPageProps) {

    return (<div className="App">
            <Favourites favourites={favourites}/>
        </div>
    );
}