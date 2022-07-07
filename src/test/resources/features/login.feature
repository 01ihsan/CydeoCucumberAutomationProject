Feature: FinWorksERP app login feature
  User Story:
  As a user,
  I should be able to login with correct credentials.

  Background: for the scenarios in the feature file, user is expected to be on login page
    Given user is on the login page

  @wip
  Scenario Outline: Positive Test Cases
    When user enters "<ValidUserName>"
    And user types "<ValidUserPassword>"
    And user clicks login button
    Then user should be able to see "<ValidUserName>" on the upper right corner

    Examples: valid login credentials are listed below
      | ValidUserName           | ValidUserPassword |
      | salesmanager20@info.com | salesmanager      |
      |                         |                   |
      |                         |                   |
      |                         |                   |

  Scenario Outline: Login with invalid Credentials
    When user enters "<InvalidUserName>"
    And user types "<InvalidUserPassword>"
    And user clicks login button
    Then user shouldn't be able to login

    Examples: invalid login credentials are listed below
      | InvalidUserName         | InvalidUserPassword |
      | salesmanager20@info.com | salesmanager        |
      |                         |                     |
      |                         |                     |
      |                         |                     |
      |                         |                     |

  Scenario Outline: Login with empty Credentials
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

