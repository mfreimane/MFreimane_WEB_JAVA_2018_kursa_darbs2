# new feature
# Tags: optional

Feature: Reservation feature
  Test the functionality of reservation

  Background:
    Given: Given I have opened homepage
    And I am in Signup form
    And I have created new account

  @TEST
  Scenario: Succesfull reservation
    Given I have an existing account
    When I login this account
      And I navigate to Home page
      And I select FLIGHTS menu in booking section
      And I select ROUND TRIP flight option
      And I set FIRST class tickets
      And I set "RIX" as departure airport
      And I set "BCN" as arrival airport
      And I set "2018-10-02" as departure date
      And I set "2018-10-19" as the return date
      And I set two adults
#      And I set 2 children
#      And I set 1 infant
#      And I search for a flight
#      And I book the first flight offer available
#      And I confirm the booking
#      And I navigate to Home page
#      And I navigate to Accounts page
#      And I open invoice for the newest booking
#    Then new booking contains correct flight details
