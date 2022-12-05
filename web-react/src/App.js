import React from 'react';

import { Footer, Highlights, WhatEvenTrade, Header} from './containers';
import {  Navbar } from './components';
import './App.css';

const App = () => {
  return (
    <main className='App'>
      <div className='gradient__bg'>
        <Navbar />
        <Header />
      </div>
        <WhatEvenTrade />
        <Highlights />
        <Footer /> 
    </main>
  )
}

export default App