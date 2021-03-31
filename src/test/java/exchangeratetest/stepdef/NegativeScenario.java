package exchangeratetest.stepdef;

import static io.restassured.RestAssured.*;
import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;

import exchangeratetest.runner.TestBase;

public class NegativeScenario extends TestBase {

	TestContext testcontext;

	public NegativeScenario(TestContext testcontext) {
		this.testcontext = testcontext;
	}

	//String Currentdate = java.time.LocalDate.now().toString();
	
	String Currentdate = TestBase.EuropeanDate();

	@Given("European Exchange rate API is up and running")
	public void european_exchange_rate_API_is_up_and_running() {
		testcontext.req_spec = given().baseUri(server);
	}

	@When("I hit the European Exchange Rate API for the mentioned date {string}")
	public void i_hit_the_european_exhange_rate_API_for_the_mentioned_date(String specificdate) {
		testcontext.resp = testcontext.req_spec.when().get(specificdate);
		testcontext.scn.log("The API URL hit for getting the Response is :" + server + specificdate);

	}

	@Then("Exchange Rate API returns the response with status code as {int}")
	public void api_returns_the_success_response_with_status_code_as(Integer int1) {

		if (testcontext.resp.getStatusCode() == 200) 
		{
			testcontext.scn.log("API Request is successfully triggered with Status Code as :" + testcontext.resp.statusCode());
			testcontext.scn.log("API Response body is :" + testcontext.resp.asPrettyString() + "<br>");
		} 
		else 
		{
			testcontext.scn.log("API Request is failed with Status Code as :" + testcontext.resp.statusCode());
			testcontext.scn.log("API Response body with error message as :" + testcontext.resp.asPrettyString() + "<br>");
			testcontext.resp.then().assertThat().statusCode(200);
			
		}
	}

	

}
