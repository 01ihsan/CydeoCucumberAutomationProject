Feature: FinWorksERP app login feature
  User Story,
  User should be able to login.
  Acceptance Criteria
  1. User should be able to login with valid credentials.
  2. User shouldn't be able to login with invalid credentials and get error message.
  4. User shouldn't be able to login with empty credentials.

  Background: for the scenarios in the feature file, user is expected to be on login page
    Given user is on the login page

  Scenario Outline: User should be able to login with valid credentials.
    When user enters "<ValidUserName>"
    And user types "<ValidUserPassword>"
    And user clicks login button
    Then user should be able to see "<ValidUserName>" on the upper right corner

    Examples: valid login credentials are listed below
      | ValidUserName              | ValidUserPassword |
      | salesmanager20@info.com    | salesmanager      |
      | posmanager20@info.com      | posmanager        |
      | expensesmanager20@info.com | expensesmanager   |

  Scenario Outline: 2. User shouldn't be able to login with invalid credentials and get error message.
    When user enters "<InvalidUserName>"
    And user types "<InvalidUserPassword>"
    And user clicks login button
    Then user should get Wrong login-password message

    Examples: invalid login credentials are listed below
      | InvalidUserName          | InvalidUserPassword |
      | posmanager10@.com        | 1234567             |
      | imm10@info.com           | 1234....            |
      | expensesmanager@info.com | expanager           |
      | manuf_user10             | asdasasfsfa         |
      | salesmanager10@info.com  | manager             |

  Scenario Outline: User shouldn't be able to login with empty credentials.
    When user enters "<EmptyUsername>"
    And user types "<EmptyPassword>"
    And user clicks login button
    Then user shouldn't be able to login

    Examples: invalid login credentials are listed below
      | EmptyUsername           | EmptyPassword |
      |                         |               |
      | salesmanager20@info.com |               |
      |                         | salesmanager  |
      |                         | 123456        |
      | 123@456.com             |               |