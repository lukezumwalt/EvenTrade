import React, {useState} from 'react';
import { default as Login } from '../login/Login';
import './dashboard.css'

const Dashboard = () => {

  const [token, setToken] = useState();

  if(!token) {
    return <Login setToken={setToken} />
  }

  return (
    <div>Dashboard</div>
  )
}

export default Dashboard