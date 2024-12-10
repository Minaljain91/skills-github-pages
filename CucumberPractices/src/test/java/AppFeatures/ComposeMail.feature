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
Feature: Compose a new mail

  @tag1
  Scenario: Compose new mail
    Given I have the Inbox screen after login
    When I click on Compose button
    Then I see the New message pop up
    And I enter Subject as "Incubyte"
    And I enter Body text as "QA test for Incubyte"
    And I enter email address in To field "minaldjain@gmail.com"
    Then I click on Send button
    
    @tag2
    Scenario: Failed to Send mail
     Given I have the Inbox screen after login
    When I click on Compose button
    Then I see the New message pop up
    And I enter Subject as "Incubyte"
    And I enter Body text as "QA test for Incubyte"
    And I enter invalid email id "test123"
    Then I click on Send button
    And Error message should be dispalyed.

 
