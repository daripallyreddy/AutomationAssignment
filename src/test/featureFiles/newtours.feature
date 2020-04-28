Feature: Logon to the website and Book a Ticket

  Scenario: Register a User and Login and book a Ticket
    Given Intiate ChromeDriver
    When Navigate the site "http://newtours.demoaut.com/"
    Then Click on the "Register" for registering the user
    Then Register the User with all required data
    Then Click on the "Flights" for registering the user
    Then enter the flight details
    Then select the Flight
    Then Give Passengers Info
    Then Take ScreenShot
    Then LogOut of the Application
    Then close the browser