Feature: Login Functionality


Scenario: Verify login with valid credentials
    Given user is on login page
    When user enters valid email and password
    And user clicks on login button
    Then user should be logged in successfully


  Scenario: Verify home option visible on loginPage
    Given user is on login page
    Then user able to see home option


  Scenario: Verify product option visible on loginPage
    Given user is on login page
    Then user able to see products option


  Scenario: Verify cart option visible on loginPage
    Given user is on login page
    Then user able to see cart option


