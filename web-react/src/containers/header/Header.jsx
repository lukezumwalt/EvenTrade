// Based off of youtube tutorial https://www.youtube.com/watch?v=LMagNcngvcU //

import React from 'react';
import './header.css';
import people from '../../assets/people.png';
import logo from '../../assets/logo.png';


const Header = () => {
  return (
    <div className='eventrade__header section__padding' id='home'>
      <div className='eventrade__header-content'>
        <h1 className='gradient__text'>Blockchain Ticket Exchange Medium</h1>
        <p>Our website encompasses a ticket exchange medium that utilizes blockchain
          technology to combat scams and scalpers in our ticket economy. We give our
          ticket buyers the security of buying real tickets without the fear of scams.
          We enable our ticket sellers to choose how they want to sell; whether through
          purchase or trade.
        </p>
        <div className='eventrade__header-content__input'>
          <input type='email' placeholder='Your Email Address'></input>
          <button type='button'>Get Started</button>
        </div>

        <div className='eventrade__header-content__people'>
          <img src={people} alt='people'/>
          <p>0 people requested access in the last 24 hours</p>
        </div>
      </div>
      <div className='eventrade__header-image'>
        <img src={logo} alt='logo'/>
      </div>
    </div>
  )
}

export default Header