@Login
Feature: To validate the order feature laptop

@SAUCELABS
Scenario: TC2 To verify user is able to order a Laptop

    Given User lands on Sign In page of SL
    When User enters UserName
    And User enters Password
    Then User is logged in to home page of sauce labs
    And Fail The scenario
    
    
 