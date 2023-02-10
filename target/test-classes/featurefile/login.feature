@login
Feature: to login the facebook application
@Regression
  Scenario Outline:to validate login using invalid usernme and invalid password
    Given User have to enter facebook login through chrome browser
    When user enter" <username>" and "< password>"
    And user click the login button
    Then user should be in invalid credential page

Examples:
|username|password|
|rea123@gmail.com|renu123|
|ewty123@gmail.com|rtwyi456|
|lithvi123@gmail.com|frtyu456|
 
 



