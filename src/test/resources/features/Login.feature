# new feature
# Tags: optional

Feature: Login feature
  Test the functionality of login

  Scenario: Succesfull login
    Given I have opened homepage
    And I am in Signup form
    And I have created new account
    And I select User Account button
   When I select Logout button in Navigation bar
   And I enter a User email
   And I enter a User password
   And I select login button in Login form
   Then I successfully logged in


#    When I select My Account button
#    And I select Login button
#    And I enter a regular User email
#    And I enter a regular User password
#    And I select login button in Login form
#    Then I successfully logged in