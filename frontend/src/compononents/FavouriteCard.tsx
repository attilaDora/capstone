import './CocktailCard.css'
import {useNavigate} from "react-router-dom";
import * as React from 'react';
import {Favourite} from "../model/Favourite";

type FavouriteCardProps = {
    favourite : Favourite
}

export default function FavouriteCard( { favourite } : FavouriteCardProps){

    const navigate = useNavigate()

    const onClick =() =>{
        navigate(`/cocktail/${favourite.id}`)
    }

    return <div className="cocktail-card" >

        <h3 className="name" onClick={onClick}>{favourite.name}</h3>
        <img className="image" onClick={onClick} src={favourite.imageUrl} alt={favourite.name}/>
    </div>
}