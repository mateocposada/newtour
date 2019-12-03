Feature: Register new user
  I as a new user I want to create a account to start looking for flights

  Scenario: Register new user
    Given user wants to looking for flights
    When user creates a new account
    Then user should see the confirmation of registration