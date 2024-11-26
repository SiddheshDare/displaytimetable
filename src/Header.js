// src/Header.js
import React from 'react';
import LogoutButton from './LogoutButton'; // Import the LogoutButton component
import './Header.css'; // Import the CSS file for styling

const Header = () => {
    const email = localStorage.getItem('email'); // Retrieve the email from local storage

    return (
        <div className="header">
            <div className="welcome-message">
                Welcome {email}
            </div>
            <div className="logout-button">
                <LogoutButton />
            </div>
        </div>
    );
};

export default Header;