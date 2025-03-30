#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login Functionality

  @Valid_Login @Regression
  Scenario Outline: Login with credentials
    Given Launch the application
    Then User is able to see login page
    When User enters username in username field as "<username>"
    And User enters password in password field as "<password>"
    And User click on Login button

    Examples: 
      | username | password |
      | admin    | Admin123 |
