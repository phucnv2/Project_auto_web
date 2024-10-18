Feature: Login CMS
@phucnv
  Scenario: Login success
    Given user navigate to login
    When user insert username and password success
    And click login button
    Then user redirect to admin page
