import {useEffect, useState} from "react";
import {getShoppingItems, postShoppingItem} from "../service/CocktailsApiService";
import {ShoppingItem} from "../model/ShoppingItem";

export default function useShoppingItems() {
    const [shoppingItems, setShoppingItems] = useState<ShoppingItem[]>([])

    useEffect(() => {
        getShoppingItems()
            .then(shoppingItems => setShoppingItems(shoppingItems))
            .catch(() => console.error("There is no shopping items"))
    }, [])

    const addShoppingItem = (shoppingItem: ShoppingItem) => {
        postShoppingItem(shoppingItem)
            .then((shoppingItem) => setShoppingItems([...shoppingItems, shoppingItem]))
    }
    return{
        addShoppingItem, shoppingItems
    }
}