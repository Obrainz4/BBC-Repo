Feature: Sign in

  Background: Common steps
    Given that I navigate to BBC Homepage

  Scenario Outline: User can successfully sign in to BBC webpage
    And I click on the sign in
    When I enter a valid "<Detail>"
    And I enter a valid Password as "4EVAURonyx"
    And I click on the Sign in user button
    Then I will be successfully logged into BBC webpage

    Examples:
      |Detail|
      |onyx3k4u@yahoo.com|


 Scenario Outline: User can cannot successfully sign into BBC webpage
   And I click on sign in
   When I enter a "<Emailorusername>"
   And I enter a "<Password>"
   And I click on the Sign in user button
   Then an error message is displayed

   Examples:
    |Emailorusername|Password|
    |test@gmail.com |test123 |
    |test@gmail.com |        |
    |               |test123 |


  Scenario Outline: User can search for specific kind of news
    When I click on the search BBC field
    And I enter the "<typeofnews>"
    Then a list of news is displayed

    Examples:
      |typeofnews|
      |UK Politics|
      |World news |