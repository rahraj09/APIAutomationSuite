$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/IncorrectURLCheck.feature");
formatter.feature({
  "name": "Verify different features of Exchange Rates API",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify the Error response for incorrect URL for Exchange rates request",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Exchange rate API is up and running",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I hit the API URL for the latest currency exchange rates",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "API returns the response with status code as 200",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "API should return the error message \"Error:getaddrinfo ENOTFOUND https://api.rateapi.i\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("Features/ResponseMessageCheck.feature");
formatter.feature({
  "name": "Verify different features of Exchange Rates API",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify the Response is generated for Latest Exchange rates request",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Exchange rate API is up and running",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I hit the API URL for the latest currency exchange rates",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "API returns the response with status code as 200",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Response is getting pulled with all the exchange rate data for different currencies",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("Features/StatusCodeCheck.feature");
formatter.feature({
  "name": "Verify different features of Exchange Rates API",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify the Status Code for GET Latest Exchange rates request",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Exchange rate API is up and running",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I hit the API URL for the latest currency exchange rates",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "API returns the response with status code as 200",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});