import {Cocktail} from "../model/Cocktail";
import axios from "axios";

export const getAllCocktails: () => Promise<Cocktail[]> = () => {
    return axios.get<Cocktail[]>("cocktail")
        .then(response => response.data)
}

export const getCocktailById: (id: string) => Promise<Cocktail> = (id:string)=>{
    console.log(id)
    return axios.get(`/cocktail/${id}`)
        .then(response => response.data)
}