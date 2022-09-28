Feature: Zoho Application

Scenario: Home Page
Given user Lauch The Application Url
When user Enter The EmailId
And user Enter The Password
Then user Click The Logbtn


Scenario: User Create Account
When user Go Back And Click On CreateAccount Button
And user Enter The Firstname And Lastname
And user Enter The Mobile Number And Password
And user Select The Date Of Birth
And user Select The Gender And Then Cick On SignUp Button
And user Take The ScreenShot
Then close The Application Url