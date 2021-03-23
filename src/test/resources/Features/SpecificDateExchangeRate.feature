
Feature: Verify different features of Exchange Rates API for specific mentioned Date

Scenario: Verify if Success Status Code is generated while triggering GET Request for specific date
Given Currency-Exchange rate API is up and running
When I hit the API URL for the specific date exchange rate with endpoint as "/2021-03-17"
Then API return the response with status code as 200

Scenario: Verify the Response is received while hitting Exchange rate Request with specific Date
Given Currency-Exchange rate API is up and running
When I hit the API URL for the specific date exchange rate with endpoint as "/2021-03-17"
Then API return the response with status code as 200
And Response is getting pulled for the specific date

