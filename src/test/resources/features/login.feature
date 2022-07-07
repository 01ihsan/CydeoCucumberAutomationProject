Feature: FinWorksERP app login feature
  User Story:
  As a user,
  I should be able to login with correct credentials.

  Background: for the scenarios in the feature file, user is expected to be on login page
    Given user is on the login page

  Scenario Outline: Positive Test Cases
    When user enters "<userName>"
    And user types "<userPassword>"
    And user clicks login button
    Then user should see the dashboard

    Examples: valid login credentials are listed below
      | userName | userPassword |
      |          |              |