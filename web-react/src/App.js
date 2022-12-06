// Based off of youtube tutorial https://www.youtube.com/watch?v=LMagNcngvcU //
// Based off of youtube tutorial https://www.youtube.com/watch?v=wr3VmbZdVA4 //

import React from 'react';
import { Footer, Highlights, WhatEvenTrade, Header} from './containers';
import {  Navbar } from './components';
import Profile from './containers/profile/Profile';
import './App.css';
import { useAuth0 } from "@auth0/auth0-react";

const App = () => {

  const { isLoading, error } = useAuth0();

  return (
    <main className='App'>
      <div className='gradient__bg'>
        <Navbar />
        <Header />
      </div>
        <WhatEvenTrade />
        <Highlights />
        {error && <p>Authentication Error</p>}
        {!error && isLoading && <p>Loading...</p>}
        {!error && !isLoading && (
          <Profile />
        )}
        <Footer /> 
    </main>
  )
}

export default App