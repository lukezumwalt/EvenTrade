// Based off of youtube tutorial https://www.youtube.com/watch?v=wr3VmbZdVA4 //

import React from "react";
import { useAuth0 } from '@auth0/auth0-react';
import Feature from "../../components/feature/Feature";
import "./profile.css"

const Profile = () => {
    const { user, isAuthenticated } = useAuth0();

    return (
        isAuthenticated && (
            <div className='eventrade__profile section__margin' id="profile">
                <div className="eventrade__profile-feature">
                    <Feature title = "Profile"></Feature>
                </div>
                <div className="eventrade__profile-heading">
                    <div className="eventrade__profile-image">
                        {user.picture && <img src={user.picture} alt={user.name} />}
                    </div>
                    <h1 className="gradient__text">{user.name}</h1>
                </div>
                <div className="eventrade__profile-heading">
                    <p>You can insert a bio here</p>
                </div>
                <div className="eventrade__profile-container">
                    <Feature title="Postings" text="No Tickets have been posted yet."></Feature> 
                </div>
            </div>
        )
    )
}

export default Profile