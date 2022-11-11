import React from 'react';
import './whatEvenTrade.css';
import { Feature } from '../../components';

const WhatEvenTrade = () => {
  return (
    <div className='eventrade__whateventrade section__margin' id="whateventrade">
      <div className='eventrade__whateventrade-feature'>
        <Feature title='What is Eventrade?' text='lorem ipsem'/>
      </div>
      <div className='eventrade__whateventrade-heading'>
        <h1 className='gradient__text'>Secure and Safe Ticket Exchange</h1>
        <p>Search for Tickets</p>
      </div>
      <div className='eventrade__whateventrade-container'>
        <Feature title='Feature 1' text='lorem isum'/>
        <Feature title='Feature 2' text='lorem isum'/>
        <Feature title='Feature 3' text='lorem isum'/>
      </div>
    </div>
  )
}

export default WhatEvenTrade