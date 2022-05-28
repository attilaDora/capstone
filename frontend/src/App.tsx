import React, {ChangeEvent, useState} from 'react';
import './App.css';
import CocktailsOnHomepage from "./compononents/CocktailsOnHomepage";
import Header from "./compononents/Header";
import SearchField from './compononents/SearchField'
import useCocktails from "./hooks/useCocktails";

export default function App() {

    const cocktails = useCocktails()
    const [searchText, setSearchText] = useState<string>("")

    const filteredCocktails = cocktails.filter(cocktail => cocktail.name.toLocaleLowerCase().includes(searchText.toLocaleLowerCase()))

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

