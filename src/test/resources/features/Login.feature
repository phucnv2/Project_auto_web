Feature: Login CMS

  @loginSuccess
  Scenario: Login success
    Given user navigate to login
    When user insert username and password success
    And click login button
    Then user redirect to admin page

  @ValidCredentials
  Scenario: Login with valid credentials
    Given Open web "oranHRM"
    When User enters username as "Admin"
    And User enters password as "admin123"
