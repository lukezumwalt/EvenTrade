// Based off of youtube tutorial https://www.youtube.com/watch?v=wr3VmbZdVA4 //

import React from "react";
import { useAuth0 } from '@auth0/auth0-react';
import Feature from "../../components/feature/Feature";
import "./profile.css"

const Profile = () => {
    const { user, isAuthenticated } = useAuth0();

    return (
        isAuthenticated && (
            <article className='eventrade__profile' id="profile">
                <div className="eventrade__profile-heading">
                    <div className="eventrade__profile-image">
                        {user.picture && <img src={user.picture} alt={user.name} />}
                        <div className="eventrade__profile-feature">
                            <Feature title={user.name}></Feature>
                        </div>
                    </div>
                    <p>
                        <ul>
                            {Object.keys(user).map((objKey, i) => <li key={i}>{objKey}: {user[objKey]} </li>)}
                        </ul>
                    </p>
                </div>
            </article>
        )
    )
}

export default Profile