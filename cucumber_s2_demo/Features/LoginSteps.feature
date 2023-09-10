Feature: Login to DemoWebShop

  Scenario: Successful Login
    Given User on the DemoWebShop login page
    When User clicks on the login link
    And User enters "Itest@test.com" as email
    And User enters "Itest@test" as password
    Then User should be logged in successfully

   
