Feature: Online Login
This is a test for online TestmeApp


@smoke @sanity
Scenario: Valid Login at Testme App
Given  online Testmeapp should be  open
When user provide valid login username and password
Then user should be able to go to next page

@sanity
Scenario: Invalid login at Testme App
Given  online Testmeapp open
When user provide invalid login credentials 
Then  user should get an error message

@sanity
Scenario: Blank login at Testme App
Given  online Testmeapp is on
When user  provide blank  login credentials 
Then user should get an blank error message
