import React, { useState } from 'react';
import { RiMenu3Line, RiCloseLine } from 'react-icons/ri';
import './navbar.css';
import logo from '../../assets/logo.svg'
import LoginButton from '../login/LoginButton';
import LogoutButton from '../login/LogoutButton';
import Profile from '../login/Profile';
import { useAuth0 } from "@auth0/auth0-react";

const Menu = () => (
  <>
  <p><a href='#home'>Home</a></p>
  <p><a href='#wet'>What is EvenTrade?</a></p>
  <p><a href='#highlights'>Highlights</a></p>
  <p><a href='#blog'>Listings</a></p>
  </>
)

const Navbar = () => {
  const [toggleMenu, setToggleMenu] = useState(false);
  const { isLoading, error } = useAuth0();

  return (
    <div className='eventrade__navbar'>
      <div className='eventrade__navbar-links'>
        <div className='eventrade__navbar-links_logo'>
          <img src={logo} alt='logo' />
        </div>
        <div className='eventrade__navbar-links_container'>
          <Menu />
        </div>
      </div>
      <div className='eventrade__navbar-sign'>
        {error && <p>Authentication Error</p>}
        {!error && isLoading && <p>Loading...</p>}
        {!error && !isLoading && (
          <>
            <LoginButton />
            <LogoutButton />
          </>
        )}
      </div>
      <div className='eventrade__navbar-menu'>
        {toggleMenu 
          ? <RiCloseLine color='#fff' size={27} onClick={() => setToggleMenu(false)}/> 
          : <RiMenu3Line color='#fff' size={27} onClick={() => setToggleMenu(true)}/>        
        }
        {toggleMenu && (
          <div className='eventrade__navbar-menu_container scale-up-center'>
            <div className='eventrade__navbar-menu_container-links'>
              <Menu />
              <div className='eventrade__navbar-menu_container-links-sign'>
                {error && <p>Authentication Error</p>}
                {!error && isLoading && <p>Loading...</p>}
                {!error && !isLoading && (
                  <>
                    <LoginButton />
                    <LogoutButton />
                  </>
                )}
              </div>
            </div>
          </div>
        )}
      </div>
    </div>
  )
}

export default Navbar