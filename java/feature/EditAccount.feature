Feature: EditAccount Functionality of LeafTaps Application
@functional
Scenario: Edit Account with valid data
Given Enter the user name 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click login button
Then Homepage should be displayed
When Click on crmsfa link
And Click Accounts link
And Click FindAccounts link
And Click Account TextBox
Given Enter AccountName as DAccount
When Click Find Accounts link
And Click Found Account
And Click Edit link
And Clear AccountName
Given Enter New Account
And Click Save button
And Verify Edited Account
And Deactivate Account