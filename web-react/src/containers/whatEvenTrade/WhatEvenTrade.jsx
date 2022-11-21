import React from 'react';
import './whatEvenTrade.css';
import { Feature } from '../../components';

const WhatEvenTrade = () => {
  return (
    <div className='eventrade__whateventrade section__margin' id="wet">
      <div className='eventrade__whateventrade-feature'>
        <Feature title='What is Eventrade?' text='EvenTrade is one of many cutting-edge applications that put ticket ownership back in consumers hands. By using blockchain and NFT technology, users can buy, sell, and collect tickets without the risk of scams.'/>
      </div>
      <div className='eventrade__whateventrade-heading'>
        <h1 className='gradient__text'>Secure and Safe Ticket Exchange</h1>
        <p>Search for Tickets</p>
      </div>
      <div className='eventrade__whateventrade-container'>
        <Feature title='Security' text='We plan to accomplish this by safely and publicly storing non-fungible event media on a blockchain database. Through the use of NFTS, users will be able to have true ownership over their event tickets.'/>
        <Feature title='Accessbility' text=' Users will be able to search for tickets to buy or trade, list tickets to sell or trade, and notify buyers and sellers. We hope to enable offerings of multiple nights in one listing for when an event spans longer than one day'/>
        <Feature title='Ease of Use' text='Want to be notified when those tickets go on sale? Our application will be able to notify users when to sell or buy. These notifications will include available offers in sellers range, available offers for trade (to seller discretion), and when a buyout has been executed at seller specified threshold.'/>
      </div>
    </div>
  )
}

export default WhatEvenTrade