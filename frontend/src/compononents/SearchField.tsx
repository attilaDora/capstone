import {ChangeEventHandler} from "react";
import './SearchField.css'

export type SearchFieldProps = {
    searchText: string,
    onSearchInputChange: ChangeEventHandler<HTMLInputElement>
}

export default function SearchField({searchText, onSearchInputChange}: SearchFieldProps) {
    return (
        <div className={"search-field"}>
            <input className={"search-input"} placeholder={"Search"} value={searchText}
            onChange={onSearchInputChange}/>
        </div>)
}
