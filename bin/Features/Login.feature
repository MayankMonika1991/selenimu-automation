Feature: UserLogin

  Scenario Outline: Login to SauceDemo website
    Given Open the browserURL "https://www.saucedemo.com/"
    When Enter the username "standard_user" & password "secret_sauce"
    When Click on loginButton
    Then User successfully logged in
    And Close the browser