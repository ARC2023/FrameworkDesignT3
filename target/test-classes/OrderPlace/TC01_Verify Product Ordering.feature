@Login
Feature: To validate the order feature

@SAUCELABS
Scenario: TC1 To verify user is able to order a product

    Given User lands on Sign In page of SL
    When User enters UserName
    And User enters Password
    Then User is logged in to home page of sauce labs
    
    
 