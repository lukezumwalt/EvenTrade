import React from 'react';
import { Feature } from '../../components';
import './highlights.css';

const featuresData = [
  {
    title: 'New York Knicks at Denver Nuggets',
    text: 'Wednesday, November 16th @ 8:00pm : Denver Nuggets play New York Knicks at Ball Arena'
  },
  {
    title: 'Liquid Stranger',
    text: 'Thursday, November 17th @ 7:30pm: Liquid Stranger headlines with openers: Kill the Noise, Jantsen b2b ZEKE BEATS, TVBOO, Sully, Drinkurwater at Mission Ballroom, Denver CO.'
  },
  {
    title: 'Jake Scott',
    text: 'Thursday, November 17th @ 8:00pm: Jake Scott headlines with openers: ROSIE and Brynn Cartell at Gothic Theatre in Denver,CO.'
  },
  {
    title: 'Barefoot in the Bathroom with The Dick Nixons, The Dirty Turkeys',
    text: 'Thursday, November 17th @ 9:00pm: Located at Fox Theatre in Boulder, CO. '
  }
]

const highlights = () => {
  return (
    <div className='eventrade__highlights section__padding' id='highlights'>
      <div className='eventrade__highlights-heading'>
        <h1 className='gradient__text'> Events on the Horizon</h1>
        <p>Sign up now to get tickets for your next event</p>
      </div>
      <div className='eventrade__highlights-container'>
        {featuresData.map((item,index) => (
          <Feature title={item.title} text={item.text} key={item.title + index} />
        ))}
      </div>
    </div>
  )
}

export default highlights