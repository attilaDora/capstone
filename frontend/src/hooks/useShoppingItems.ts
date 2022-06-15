import {useEffect, useState} from "react";
import {getShoppingItems, postShoppingItem, removeShoppingItem} from "../service/CocktailsApiService";
import {ShoppingItem} from "../model/ShoppingItem";

export default function useShoppingItems() {
    const [shoppingItems, setShoppingItems] = useState<ShoppingItem[]>([])

    useEffect(() => {
        getShoppingItems()
            .then(shoppingItems => setShoppingItems(shoppingItems))
            .catch(() => console.error("There is no shopping items"))
    }, [])

    const addShoppingItem = (shoppingItem: Omit<ShoppingItem, "id">) => {
        postShoppingItem(shoppingItem)
            .then((shoppingItem) => setShoppingItems([...shoppingItems, shoppingItem]))
    }

    const deleteShoppingItem =  (id:string) => {
        removeShoppingItem(id)
            .then(() => setShoppingItems(shoppingItems.filter(shoppingItem => shoppingItem.id !==id)))
            .catch(() => console.error())
    }
    return{
        addShoppingItem, shoppingItems, deleteShoppingItem
    }
}
