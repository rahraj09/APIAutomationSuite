
Feature: Verify if Exchange Rate Response can be extracted for a particular date from European Exchange Rate API

Scenario Outline: Verify if Latest Date Exchange rate response is received while triggering request for any future date
Given European Exchange rate API is up and running
When I hit the European Exchange Rate API for the mentioned date "<SpecificDate>"
Then Exchange Rate API returns the response with status code as <ResponseCode>



Examples: 
| SpecificDate | | ResponseCode | 
| /10-10-2021 | | 200 | 