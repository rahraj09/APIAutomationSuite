package exchangeratetest.stepdef;

import static io.restassured.RestAssured.*;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;

import static org.hamcrest.Matchers.*;
import exchangeratetest.runner.TestBase;



public class FuturedateExchangeRate  extends TestBase{

	TestContext testcontext;

	public FuturedateExchangeRate(TestContext testcontext) {
		this.testcontext = testcontext;
	}
	String Currentdate = TestBase.EuropeanDate();
	
	

	@Given("Currency-exchange rate API is up and running")
	public void currency_exchange_rate_API_is_up_and_running() {
		testcontext.req_spec = given().baseUri(server);
	}

	@When("I hit the API URL for the mentioned future date exchange rate {string}")
	public void i_hit_the_API_URL_for_the_mentioned_future_date_exchange_rate(String futuredate) {
		testcontext.resp = testcontext.req_spec.when().get(futuredate);
		testcontext.scn.log("The API URL hit for getting the Response is :"+ server+futuredate);
		
	}

	@Then("API returns the success response with status code as {int}")
	public void api_returns_the_success_response_with_status_code_as(Integer int1) {
		testcontext.resp.then().assertThat().statusCode(200);
		testcontext.scn.log("Status Code received is :" + testcontext.resp.statusCode());
	}

	@Then("The response with most latest available date API is received")
	public void the_response_with_most_latest_available_date_API_is_received() {
		testcontext.resp.then().assertThat().body("date", equalTo(Currentdate));
		 JsonPath jsonPathEvaluator = testcontext.resp.jsonPath();
		 String datereceived = jsonPathEvaluator.get("date");
		 testcontext.scn.log("API response received is for the date :" + datereceived);
		 testcontext.scn.log("Response of the request is :" + testcontext.resp.asPrettyString() + "<br>");
		 
	}

}
