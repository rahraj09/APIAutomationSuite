
Feature: Verify different features of Exchange Rates API

Scenario: Verify if Status Code 400 is received for incorrect URL for Exchange rates request
Given Exchange rate API is up and running
When I hit the API URL with endpoint as "/351latest"
Then API Status Code 400 should be displayed 