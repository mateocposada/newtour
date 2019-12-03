Feature: Login account created
  I as a user I want to login to start looking for flights

  Scenario: Login account created
    Given user wants to looking for flight
    When user make login
    Then user should see the dashboard