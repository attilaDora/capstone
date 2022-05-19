import React, {useEffect, ChangeEvent, useState} from 'react';
import './App.css';
import CocktailsOnHomepage from "./compononents/CocktailsOnHomepage";
import Header from "./compononents/Header";
import SearchField from './compononents/SearchField';
import {Cocktail} from "./model/Cocktail";
import {fetchCocktails} from "./service/CocktailsApiService";

export default function App() {

    const [cocktails, setCocktails] = useState<Cocktail[]>([])

    useEffect(()=> {
        getCocktailsFromApi()
    },[])

    const getCocktailsFromApi = () => {
        fetchCocktails("https://www.thecocktaildb.com/api/json/v2/9973533/filter.php?a=Alcoholic")
            .then(response => {
                setCocktails(response.drinks)
            })
            .catch(error => console.log(error))
    }
    const [searchText, setSearchText] = useState<string>("")

    const filteredCocktails = cocktails.filter(cocktail => cocktail.strDrink.toLocaleLowerCase().includes(searchText.toLocaleLowerCase()))

    const onSearchInputChange = (event: ChangeEvent<HTMLInputElement>) => {
        setSearchText(event.target.value)
    }
    return (
        <div className="App">
            <Header />
            <br/>
            <SearchField searchText={searchText} onSearchInputChange={onSearchInputChange} />

            <CocktailsOnHomepage cocktails={filteredCocktails} />

        </div>
    );
}

