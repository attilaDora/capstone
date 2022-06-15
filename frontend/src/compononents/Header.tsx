import './Header.css';
import {useNavigate} from "react-router-dom";
import {useState} from "react";
import useShoppingItems from "../hooks/useShoppingItems";

type HeaderProps = {
    deleteShoppingItem : (id: string) => void
}
export default function Header({deleteShoppingItem}:HeaderProps){
    const {shoppingItems} = useShoppingItems()
    const navigate = useNavigate()
    const [showCart, setShowCart] = useState(false);

    return (
        <header className="header">
            <nav>
                <div className={"container"}>
                    <ul className={"navbar-right"}>
                        <button className={"cart-button"}
                                onClick={() => setShowCart(!showCart)}>
                            🛒Cart <span
                            className={"badge"}>0</span></button>
                    </ul>
                </div>
            </nav>
            <h1 className="header__title">Need a Cocktail</h1>

            <button className="button" onClick={() => navigate(`/`)}>Homepage</button>
            <button className="button" onClick={() => navigate(`/favourite`)}>My Favourites</button>
            <button className="button" onClick={() => navigate(`/random`)}>Suggest a Cocktail</button>

            {showCart &&
            <div id="collapseID" className={"container"}>
                <div className={"shopping-cart"}>
                    <div className={"shopping-cart-header"}>
                    </div>
                    <ul className={"shopping-cart-items"}>
                        {shoppingItems.map((shoppingItem) => <div key={shoppingItem.id}>{shoppingItem.name} <button className={"delete-button"} onClick= { () => deleteShoppingItem(shoppingItem.id)}>Delete</button> </div> )}
                    </ul>
                </div>
            </div>}<br/>

        </header>
    )
}
