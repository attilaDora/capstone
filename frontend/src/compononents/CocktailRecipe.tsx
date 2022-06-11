import './CocktailRecipe.css';
import {Cocktail} from "../model/Cocktail";
import * as React from "react";
import {Favourite} from "../model/Favourite";
import {useState} from "react";
import germanPic from './germanPic.jpeg';
import frenchPic from './frenchPic.jpeg';
import spanishPic from './spanishPic.jpeg';
import italianPic from './italianPic.jpeg';
import englishPic from './englishPic.jpeg';
import {useNavigate} from "react-router-dom";


type CocktailRecipeProps = {
    cocktail: Cocktail
    addFavourite: (favourite: Favourite) => void
    deleteFavourite: (favourite: string) => void
}

export enum languages{
    german ="german",
    spanish ="spanish",
    italian ="italian",
    french ="french",
    english ="english",
}

export default function CocktailRecipe({cocktail, addFavourite, deleteFavourite}: CocktailRecipeProps) {

    let history = useNavigate()

    const allIngredients = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15].map(index => {
        // @ts-ignore
        const measure = cocktail["measure" + index];
        // @ts-ignore
        const ingredient = cocktail["ingredient" + index];
        if (measure === null || measure === undefined) return "";
        if (ingredient === null || ingredient === undefined) return "";
        return <div> {measure + " " + ingredient}
            <button className={"shopping-cart"}>🛒</button>
        </div>
    });

     const [currentLanguage, setCurrentLanguage] = useState("")


    function germanLanguage() {
        if (cocktail.instructionsDE === null || cocktail.instructionsDE === undefined) {
            return alert("Sorry! The german language is not available for the chosen cocktail.")
        } else return setCurrentLanguage("german")
    }

    function frenchLanguage() {
        if (cocktail.instructionsFR === null || cocktail.instructionsFR === undefined) {
            return alert("Sorry! The french language is not available for the chosen cocktail.")
        } else return setCurrentLanguage("french")
    }

    function italianLanguage() {
        if (cocktail.instructionsIT === null || cocktail.instructionsIT === undefined) {
            return alert("Sorry! The italian language is not available for the chosen cocktail.")
        } else return setCurrentLanguage("italian")
    }

    function spanishLanguage() {
        if (cocktail.instructionsES === null || cocktail.instructionsES === undefined) {
            return alert("Sorry! The spanish language is not available for the chosen cocktail.")
        } else return setCurrentLanguage("spanish")
    }

    function englishLanguage() {
        if (cocktail.instructions === null || cocktail.instructionsDE === undefined) {
            return alert("Sorry! The english language is not available for the chosen cocktail.")
        } else return setCurrentLanguage("english")
    }

    const language = () => {
        if (currentLanguage===languages.german) return cocktail.instructionsDE
        else if (currentLanguage===languages.french) return cocktail.instructionsFR
        else if (currentLanguage===languages.italian) return cocktail.instructionsIT
        else if (currentLanguage===languages.spanish) return cocktail.instructionsES
        else if (currentLanguage===languages.english) return cocktail.instructions
        else return cocktail.instructions}

        return (<div className="cocktail-recipe_">
            <div className="cocktail-recipe_card">
                <div className="wrapper">
                    <div className="box a">{cocktail.name}<br/>
                        <button onClick={() => addFavourite(cocktail)} className={"favourite-button"}>Add
                            to favorites
                        </button>
                        <button onClick={() => {
                            history(-1);
                            deleteFavourite(cocktail.id)
                        }} className={"favourite-button"}>Remove
                            from favorites
                        </button>
                    </div>
                    <div className="box b"><img className="cocktail-recipe_image" src={cocktail.imageUrl}
                                                alt={cocktail.name}/></div>
                    <div className="box c"><h3>Glass type:</h3> {cocktail.glass}</div>
                    <div className="box d"><h3>Ingredients:</h3> {allIngredients}</div>
                    <div className="box e">
                        {language()}<br/>
                        <img src={germanPic} alt={"german-Pic"} onClick={germanLanguage} className={"languages"}/>
                        <img src={frenchPic} alt={"french-Pic"} onClick={frenchLanguage} className={"languages"}/>
                        <img src={italianPic} alt={"italian-Pic"} onClick={italianLanguage} className={"languages"}/>
                        <img src={spanishPic} alt={"spanish-Pic"} onClick={spanishLanguage} className={"languages"}/>
                        <img src={englishPic} alt={"english-Pic"} onClick={englishLanguage} className={"languages"}/>
                    </div>
                </div>
            </div>
        </div>)
}