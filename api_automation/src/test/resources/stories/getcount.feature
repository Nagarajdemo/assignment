#Author: Nagaraj Ananth

Feature: Verify the number of posts
Scenario Outline: make a GET request and check for number of posts returned
Given make a get call to jsonplaceholder
When store the response either to pojo or jsonresponse
Then validate the number of posts returned <count>
  Examples:
  |count|
  |100|



