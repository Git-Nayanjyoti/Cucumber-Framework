Feature: OrangeHRM Application 

@Test1
Scenario: Test Login Functionality with Valid credentials 
	Given User is on Login Page 
	When User enters username 
	And user enters password 
	And user clicks on Login Button 
	Then User should be able to login successfully 
	

@Test2
Scenario: Test Login using parameters 
	Given User is on Login Page 
	When User enters username as "Admin" 
	And User enters password as "admin123" 
	And user clicks on Login Button 
	Then User should be able to login successfully 

@Test3	
Scenario Outline: Login feature using scenario outline 
	Given User is on Login Page 
	When User enters <username> and <password> 
	And user clicks on Login Button 
	Then User should be able to login successfully 
	Examples: 
		|username|password|
		|Admin|admin123|
		|test|test123|
		|abc|abc123|