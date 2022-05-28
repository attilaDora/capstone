import './App.css';
import Header from "./compononents/Header";
import useCocktails from "./hooks/useCocktails";
import {BrowserRouter, Route, Routes} from "react-router-dom";
import CocktailRecipePage from "./pages/CocktailRecipePage";
import CocktailHomePage from "./pages/CocktailHomePage";


export default function App() {
    const cocktails = useCocktails()

    return (
            <div className="App">
                <BrowserRouter>
                    <Header />
                    <Routes>
                        <Route path={"/"} element={<CocktailHomePage cocktails={cocktails}/>}/>
                        <Route path={"/cocktail/:id"} element={<CocktailRecipePage />} />
                    </Routes>
                </BrowserRouter>
            </div>
    );
}