Feature: Login CMS

  @loginSuccess
  Scenario: Login success
    Given user navigate to login
    When user insert username and password success
    And click login button
    Then user redirect to admin page
  @loginFail
  Scenario: Login success
    Given user navigate to login
    When user insert username wrong and password wrong
    And click login button
    Then verify text when login fail
