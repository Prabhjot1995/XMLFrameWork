@Addcustomer @Smoke 
 Feature: verify Techfios Bank and Cash Page 
Background: 
	Given User is on Techfios Login Page 
	@NewAccScenario_01
Scenario Outline: 1 User is already on techfios loginpage 
	When User enters "<username>" and "<password>" 
	And User clicks on sigin button 
	Then User shoould land on DashBoard Page 
	When User clicks on bank and cash 
	When User clicks on new account 
	When User fill up the form entering "<accountTitle>" and "<description>" and "<initialBalance>" and "<accountNumber>" and "<contactPerson>" and "<phone>" and "<internetBankingUrl>" and clicks on submit
	Then User clicks on submit button 
	
	Examples: 
	
	|username         |password|accountTitle|description          |initialBalance|accountNumber|contactPerson|phone     |internetBankingUrl|	
	|demo@techfios.com|abc123  |Money Savings|MoneySavings account|80000         |123456789    |James parker |123456123 |tdbank.com        |
