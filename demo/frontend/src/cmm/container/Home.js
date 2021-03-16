import React , {useState} from 'react'
import { Link } from 'react-router-dom'

const Home = () => {
    const style ={width: 150, margin: "0 auto"}
    return(<>
    <div style = {style}><h1>Home</h1>
    <Link to={"/Counter"} > Counter</Link><br/>
    <Link to={"/Login"}> Login</Link><br/>
    <Link to = {"/SignUp"}>SignUp</Link><br/>
	<Link to ={"/ArticleList"}>게시판</Link>
    </div>
    </>)
}

export default Home