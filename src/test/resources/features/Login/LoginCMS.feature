Feature: Login CMS
@phucnv
  Scenario: Login success
    Given user navigate to login
    When user insert "anhtester@email.com" abd "AnhTester@2023#" success
    And click login button
    Then user redirect to admin page "https://crm.anhtester.com/admin/"
