
Feature: Verify different features of Exchange Rates API for specific mentioned Date

Scenario: Verify if Current Date Exchange rate response is received while triggering request for any future date
Given Currency-exchange rate API is up and running
When I hit the API URL for the mentioned future date exchange rate "/2021-03-25"
Then API returns the success response with status code as 200
And The response with Current date is received 