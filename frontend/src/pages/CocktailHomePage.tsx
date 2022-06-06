import React, {ChangeEvent, useState} from "react";
import SearchField from "../compononents/SearchField";
import Cocktails from "../compononents/Cocktails";
import {Cocktail} from "../model/Cocktail";

export type CocktailHomePageProps={
    cocktails: Cocktail[]
}
export default function CocktailHomePage({cocktails}:CocktailHomePageProps) {
    const [searchText, setSearchText] = useState<string>("")

    const filteredCocktails = cocktails.filter(cocktail => cocktail.name.toLocaleLowerCase().includes(searchText.toLocaleLowerCase()))

    const onSearchInputChange = (event: ChangeEvent<HTMLInputElement>) => {
        setSearchText(event.target.value)
    }
    return(
    <div className="App">

    <SearchField searchText={searchText} onSearchInputChange={onSearchInputChange}/>

    <Cocktails cocktails={filteredCocktails}/>
    </div>
);
}