import React from 'react';

import { Footer, Blog, Highlights, WhatEvenTrade, Header, Dashboard, Login, PrivateRoute } from './containers';
import { CTA, Navbar } from './components';
import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';

const App = () => {
  
  return (
    <div className='App'>
      <div className='gradient__bg'>
        <Navbar />
        <BrowserRouter>
          <Routes>
            <Route exact path='/' element={<Header/>} ></Route>
            <Route exact path='/login' element={<Login/>}></Route>
            <Route exact path='/dashboard' element={<Dashboard/>}></Route>
        </Routes>
      </BrowserRouter>
      </div>
        <WhatEvenTrade />
        <Highlights />
        <CTA />
        <Blog />
        <Footer /> 
    </div>
  )
}

export default App