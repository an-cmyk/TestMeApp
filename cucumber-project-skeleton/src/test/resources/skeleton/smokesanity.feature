Feature: Online Login



@smoke @sanity
Scenario: Valid Login Testme App
Given  online Testmeapp should be  open
When user provide valid login username and password
Then user should be able to go to next page

@sanity
Scenario: Invalid login Testme App
Given  online Testmeapp open
When user provide invalid login credentials 
Then  user should get an error message

@sanity
Scenario: Blank login Testme App
Given  online Testmeapp is running
When user   does not provide  login credentials 
Then user  gets an blank error message
