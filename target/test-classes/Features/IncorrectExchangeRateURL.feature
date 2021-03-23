@Getlatest
Feature: Verify different features of Exchange Rates API

Scenario: Verify if 400 BAD VALUE ERROR response is received for incorrect URL for Exchange rates request
Given Exchange rate API is up and running
When I hit the API URL with endpoint as "/351latest"
Then API Error Code 400 should be displayed 