
Feature: Login using User Account Credentials

Scenario Outline: check user is able to create user for Account Module by using valid endpoint and request body
    Given User creates request for the Account API from Excel sheet "<sheetName>" 
    When User sends HTTPS POST request for user role
    Then User receives status code 201 with userid as response body for creating user
Examples:
|sheetName|
|Sheet1   |  

 #Scenario: check user is able to generate Token for User Account by using valid endpoint and request body
    #Given  User creates request for the Account API
    #When  User sends HTTPS POST request for user role
    #Then User receives status code 200 with token for authentication as response body for Token generation
    #And validate JSON Schema for login response with "loginSchema"
    #
   #Scenario: check user is able to Authorize User by using valid endpoint and request body
    #Given  User creates request for the Account API
    #When  User sends HTTPS POST request for user role with token
    #Then User receives status code 200 with response body for Authorizing user
    #And validate JSON Schema for login response with "loginSchema" 
  
 
