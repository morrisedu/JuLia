@Regression
Feature: Library app login feature
  User Story:As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.

  Accounts are: librarian, student, admin
@librarian @employee @smoke
  Scenario: Login as librarian
    Given user is on the library login page
    When user enter librarian username
    When user enter librarian password
    Then user should see dashboard
  @student @smoke
  Scenario: Login as student
    Given user is on the library login page
    When user enters student username
    And user enters student password
    Then user should see dashboard