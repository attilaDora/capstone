import {Cocktail} from "../model/Cocktail";
import './CocktailCard.css'
import {useNavigate} from "react-router-dom";
import * as React from 'react';
import {useState} from "react";

type CocktailCardProps = {
    cocktail: Cocktail
}

export default function CocktailCard({cocktail}: CocktailCardProps) {

    const navigate = useNavigate()

    function getRandom(max: number) {
        return Math.floor(Math.random() * max) + 1;
    }

    const [like, setLike] = useState(getRandom(50))
    const [dislike, setDislike] = useState(getRandom(20))

    const [likeOn, setLikeOn] = useState(false)
    const [dislikeOn, setDislikeOn] = useState(false)

    function likeFunction() {
        if (likeOn) {
            setLikeOn(false)
            setLike(like - 1)
        } else {
            setLikeOn(true)
            setLike(like + 1)
            if (dislikeOn) {
                setDislikeOn(false)
                setLike(like + 1)
                setDislike(dislike - 1)
            }
        }
    }

    function dislikeFunction() {
        if (dislikeOn) {
            setDislikeOn(false)
            setDislike(dislike - 1)
        } else {
            setDislikeOn(true)
            setDislike(dislike + 1)
            if (likeOn) {
                setLikeOn(false)
                setDislike(dislike + 1)
                setLike(like - 1)
            }
        }
    }

    const onClick = () => {
        navigate(`/cocktail/${cocktail.id}`)
    }

    return <div className="cocktail-card">

        <h3 className="name" onClick={onClick}>{cocktail.name} </h3>
        <img className="image" src={cocktail.imageUrl} alt={cocktail.name} onClick={onClick}/>
        <button onClick={likeFunction} className={'like'}>Like{like}</button>
        <button onClick={dislikeFunction} className={'dislike'}>Dislike{dislike}</button>
    </div>
}