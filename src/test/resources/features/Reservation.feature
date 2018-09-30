# new feature
# Tags: optional

Feature: Reservation feature
  Test the functionality of reservation

  Background:
    Given I have opened homepage

#  Scenario: Succesfull reservation for existing User
#    When I am in Signup form
#    And I have created new account
#    And I have an existing account
#    When I login this account
#    And I navigate to Home page
#    And I select FLIGHTS menu in booking section
#    And I select ROUND TRIP flight option
#    And I set BUSINESS class tickets
#    And I set "RIX" as departure airport
#    And I set "AMS" as arrival airport
#    And I set "2018-11-09" as departure date
#    And I set "2018-11-23" as the return date
#    And I set "2" adults
#    And I set "2" children
#    And I set "1" infant
#    And I search for a flight
#    And I book the first flight offer available
#    And I confirm the booking //Not finished
#    And I navigate to Home page //Not finished
#    And I navigate to Accounts page //Not finished
#    And I open invoice for the newest booking //Not finished
#    Then new booking contains correct flight details //Not finished


  @TEST
  Scenario: Successful reservation for User without registration
    And I select FLIGHTS menu in booking section
    And I select ROUND TRIP flight option
    And I set BUSINESS class tickets
    And I set "RIX" as departure airport
    And I set "AMS" as arrival airport
    And I set "2018-11-09" as departure date
    And I set "2018-11-23" as the return date
    And I set "2" adults
    And I set "2" children
    And I set "1" infant
    And I search for a flight
    And I book the first flight offer available
    And I enter first name in personal details form
    And I enter last name in personal details form
    And I enter email address in personal details form
    And I confirm email address in personal details form
    And I enter mobile phone number in personal details form
    And I enter home address in personal details form
    And I set country to "Latvia" in personal details form
    And I confirm the booking
#    Then I invoice details contain correct data

#  ------------------------------------------------------
#      And I set two adults
#      And I set two children
#      And I set one infant
