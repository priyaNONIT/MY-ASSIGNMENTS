Feature: CreateAccount Functionality of LeafTaps Application
Scenario Outline: Create Account with multiple data
Given Launch the browser
And Load the Url
Given Enter the user name 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click login button
Then Homepage should be displayed
When Click on crmsfa link
And Click accounts link
And Click create account link
Given Enter Account Name as <Account Name>
And Enter Local Name as <Local Name>
And Enter Phone Number as <Phone Number>
When Click create account button
Then Account Details page should be displayed <Local Name>

Examples:
|Account Name|Local Name|Phone Number|
|FirstAccount|Rose|7256783405|
|SecondAccount|John|6584942321|