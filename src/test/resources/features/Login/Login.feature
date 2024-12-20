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
#  @loginSuccess_01
#  Scenario: Login success
#    Given user navigate to login "https://www.saucedemo.com/"
#    When user insert "standard_user" wrong and "secret_sauce" wrong
#    And click login buttonn
#    Then verify text when login fail
##    Examples:
##      | url                        | username      | password     |
##      | https://www.saucedemo.com/ | standard_user | secret_sauce |
