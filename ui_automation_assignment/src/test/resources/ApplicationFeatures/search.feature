#Author: Nagaraj Ananth

Feature: Company Logo Search
Scenario Outline: search company logo
Given I have to search companyName via google
When I enter the "<companyName>" in the search field
Then validate the company logo
  Examples:
  |companyName|
  |J.P.Morgan|



