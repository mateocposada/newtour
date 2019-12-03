Feature: Choose a flight new
  I as a user I want to choose a flights new

  Background:
    Given user wants to looking for flight
    When user make login
    Then user should see the dashboard

  Scenario: Choose a flight new
    Given user wants to looking for flight
    When user choose a flight
    Then user should see the chosen flight