import {Cocktail} from "../model/Cocktail";
import axios from "axios";
import {Favourite} from "../model/Favourite";
import {ShoppingItem} from "../model/ShoppingItem";

export const getAllCocktails: () => Promise<Cocktail[]> = () => {
    return axios.get<Cocktail[]>("/cocktail")
        .then(response => response.data)
}

export const getCocktailById: (id: string) => Promise<Cocktail> = (id:string)=>{
    return axios.get(`/cocktail/${id}`)
        .then(response => response.data)
}

export function postFavourite (addFavourite: Favourite){
    return axios.post("/favourite", addFavourite)
        .then(response => response.data)
}

export const getFavourites: () => Promise<Favourite[]> = () => {
    return axios.get<Favourite[]>("/favourite")
        .then(response => response.data)
}

export const removeFavourite: (id: string) => Promise<void> = (id:string) => {
    return axios.delete(`/favourite/${id}`)
}

export function postShoppingItem (addShoppingItem: ShoppingItem){
    return axios.post("/shoppingitem", addShoppingItem)
        .then(response => response.data)
}

export const getShoppingItems: () => Promise<ShoppingItem[]> = () => {
    return axios.get<ShoppingItem[]>("/shoppingitem")
        .then(response => response.data)
}