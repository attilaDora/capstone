import {Cocktail} from "../model/Cocktail";
import axios from "axios";

export const getAllCocktails: () => Promise<Cocktail[]> = () => {
    return axios.get<Cocktail[]>("cocktail")
        .then(response => response.data)
}