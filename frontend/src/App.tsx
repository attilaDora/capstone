import './App.css';
import Header from "./compononents/Header";
import useCocktails from "./hooks/useCocktails";
import {BrowserRouter, Route, Routes} from "react-router-dom";
import CocktailRecipePage from "./pages/CocktailRecipePage";
import CocktailHomePage from "./pages/CocktailHomePage";
import useFavourite from "./hooks/useFavourite";
import FavouriteCocktailsPage from "./pages/FavouriteCocktailsPage";

export default function App() {
    const cocktails = useCocktails()
    const {addFavourite, favouriteCocktails} = useFavourite()

    return (
            <div className="App">
                <BrowserRouter>
                    <Header />
                    <Routes>
                        <Route path={"/"} element={<CocktailHomePage cocktails={cocktails}/>}/>
                        <Route path={"/cocktail/:id"} element={<CocktailRecipePage addFavourite = {addFavourite}/>} />
                        <Route path={"/favourite"} element={<FavouriteCocktailsPage favourites = {favouriteCocktails}/>}/>
                    </Routes>
                </BrowserRouter>
            </div>
    );
}