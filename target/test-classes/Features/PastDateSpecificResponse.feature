
Feature: Verify different features of Exchange Rates API for specific mentioned Date

Scenario Outline: Verify the Response is received while hitting Exchange rate Request with specific Date
Given Currency-Exchange rate API is up and running
When I hit the API URL for the specific date exchange rate with endpoint as "<PastDate>"
Then API return the response with status code as <statusCode>
And Response is getting pulled for the specific date

Examples: 

| PastDate    | | statusCode |
| /2021-03-17 | |    200     |

| /2021-03-12 | |    200     |




