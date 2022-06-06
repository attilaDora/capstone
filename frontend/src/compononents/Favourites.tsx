import './Favourites.css';
import {Favourite} from "../model/Favourite";
import FavouriteCard from "./FavouriteCard";

type FavouritesProps = {
    favourites : Favourite []
}

export default function Favourites({favourites}: FavouritesProps){

    return (

        <div className="favourites">
            {favourites.map((favourite) => <FavouriteCard key={favourite.id} favourite={favourite}/> )}
        </div>
    )
}