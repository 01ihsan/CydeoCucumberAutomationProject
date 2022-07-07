Feature: FinWorksERP app logout feature
  User Story,
  As a logged-in user, I should be securely able to log out so that I can end my session.
  AC1: Verify that the user can log out via the logout button in the profile dropdown menu.

  Background:
    Given user is already logged-in with "salesmanager20@info.com" and "salesmanager"

  Scenario:Verify that the user can log out via the logout button in the profile dropdown menu.
    When user clicks on the username field
    And user selects the logout from dropdown menu
    Then user should be able to logout
