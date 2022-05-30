import {Cocktail} from "../model/Cocktail";
import './CocktailCard.css'
import {useNavigate} from "react-router-dom";
import * as React from 'react';

type CocktailCardProps = {
    cocktail : Cocktail
}

export default function CocktailCard( { cocktail } : CocktailCardProps){

    const navigate = useNavigate()

    const onClick =() =>{
        navigate(`/cocktail/${cocktail.id}`)
    }

    return <div className="cocktail-card" onClick={onClick}>

        <h3 className="name">{cocktail.name}</h3>
        <img className="image" src={cocktail.imageUrl} alt={cocktail.name}/>
    </div>
}