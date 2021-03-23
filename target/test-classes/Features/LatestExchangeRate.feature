@Getlatest
Feature: Verify different features of Exchange Rates API

Scenario: Verify the success Status is received while hitting for Exchange Rate request
Given Currency Exchange rate API is up and running
When I hit the API URL for the latest currency exchange rates with endpoint as "/latest"
Then API returns the response with status code as 200

Scenario: Verify the Response is generated for Latest Exchange rates request
Given Currency Exchange rate API is up and running
When I hit the API URL for the latest currency exchange rates with endpoint as "/latest"
Then API returns the response with status code as 200
And Response is getting pulled with all the exchange rate data for different currencies

