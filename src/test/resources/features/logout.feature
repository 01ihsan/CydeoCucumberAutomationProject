Feature: FinWorksERP app logout feature
  User Story:
  As a user,
  I should be able to logout.

  Background:
    Given user is already logged-in with "salesmanager20@info.com" and "salesmanager"

    Scenario:
      When user clicks on the username field
      And user selects the logout from dropdown menu
      Then user should be able to logout
