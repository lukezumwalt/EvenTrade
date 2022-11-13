import React from 'react';
import { Feature } from '../../components';
import './highlights.css';

const featuresData = [
  {
    title: 'Event 1',
    text: 'Event description'
  },
  {
    title: 'Event 2',
    text: 'Event description'
  },
  {
    title: 'Event 3',
    text: 'Event description'
  },
  {
    title: 'Event 4',
    text: 'Event description'
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