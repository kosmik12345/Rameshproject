Feature: Login feature file


Scenario: User should be able to login to the application

Given User is in login page
When User enters email id "prashanthi.skvl@gmail.com"
And User enters password "Test@123"
And User clicks the signin button
Then User should be logged in successfully
