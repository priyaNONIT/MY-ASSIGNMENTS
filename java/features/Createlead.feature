Feature: CreateLead Functionality of LeafTaps Application
Scenario Outline: Create lead with multiple data
Given Enter the user name 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click login button
Then Homepage should be displayed
When Click on crmsfa link
And Click leads link
And Click Createlead link
Given Enter the companyname as <companyname>
And Enter firstname as <firstname>
And Enter lastname as <lastname>
When click on createlead button 
Then ViewLeads page should be displayed<companyname>


Examples:
|companyname|firstname|lastname|
|Testleaf|Subraja|S|
|Qeagle|Princilla|R|

