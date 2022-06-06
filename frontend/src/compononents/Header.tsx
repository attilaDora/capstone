import './Header.css';
import {useNavigate} from "react-router-dom";

export default function Header() {

    const navigate = useNavigate()
    return (
        <header className="header">
            <h1 className="header__title">Need a Cocktail</h1>
            <button className="button" onClick={() => navigate(`/favourite`)}>My Favourites</button>
            <button className="button" onClick={() => navigate(`/`)}>Homepage</button>
        </header>
    )
}