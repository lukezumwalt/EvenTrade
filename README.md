# EvenTrade
Decentralized web application for exchanging event tickets between real humans.

 **Marie Hargan, Lukas Zumwalt**

*Java Version*

- openjdk 17.0.4.1 2022-08-12
- OpenJDK Runtime Environment Temurin-17.0.4.1+1 (build 17.0.4.1+1)
- OpenJDK 64-Bit Server VM Temurin-17.0.4.1+1 (build 17.0.4.1+1, mixed mode, sharing)

*Node Version*

v18.12.1

********
To view the frontend of our application, enter the following commands: </br>
```cd web-react``` </br >
``` npm start ``` </br >

This will automatically open a tab on your browser showing the frontend application on ```localhost```.

You will see several tabs on the Navigation Bar, which also dynamically resizes into a dropdown menu if the window/screen size changes. There is also a Sign In button in the top right of the Navigation Bar. Using the Auth0 third-party, users can Sign In or Sign Up. Once signed in, the button will change into a Sign Out button. The profile tab also becomes accessible to the user. If a user is not signed in the Profile tab will not work. Once a user signs in and selects profile, the user can see their name, profile picture, and postings created. If a user logs in or creates an account with their google account, Auth0 scrapes the user's name and profile picture from their google account into the EvenTrade profile page.
