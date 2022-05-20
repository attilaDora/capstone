import {ChangeEventHandler} from "react";
import './SearchField.css'

export type ActionBarProps = {
    searchText: string,
    onSearchInputChange: ChangeEventHandler<HTMLInputElement>
}

export default function ActionBar({searchText, onSearchInputChange}: ActionBarProps) {
    return (
        <div className={"action-feld"}>
        <input className={"search-input"} placeholder={"Search"} value={searchText}
    onChange={onSearchInputChange}/>
    </div>)
}
