import React, {useState} from 'react'
import Counter from './cmm/container/Counter'
import Login from './sec/container/Login'
import SignUp from './uss/container/SignUp'
import {Route} from 'react-router-dom'
import Home from './cmm/container/Home'
import ArticleList from './bbs/container/ArticleList'

const App = () => {
    return(<>
    <Route path="/" component={ Home } exact/>
     <Route path="/Counter" component={ Counter }Counter/>
     <Route path = "/Login" component={ Login }Login/>
     <Route path = "/SignUp" component={ SignUp }SignUp/>    
     <Route path = "/ArticleList" component={ArticleList} ArticleList/>
    </>)
}

export default App
