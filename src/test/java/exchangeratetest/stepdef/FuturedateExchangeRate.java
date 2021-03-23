package exchangeratetest.stepdef;

import static io.restassured.RestAssured.*;
import io.cucumber.java.en.*;
import static org.hamcrest.Matchers.*;

import io.cucumber.java.Scenario;


import exchangeratetest.runner.TestBase;
import io.restassured.response.Response;


public class FuturedateExchangeRate extends TestBase {

	TestContext testcontext;

	public FuturedateExchangeRate(TestContext testcontext) {
		this.testcontext = testcontext;
	}

	String Currentdate = java.time.LocalDate.now().minusDays(1).toString();

	@Given("Currency-exchange rate API is up and running")
	public void currency_exchange_rate_API_is_up_and_running() {
		testcontext.req_spec = given().baseUri(server);
	}

	@When("I hit the API URL for the mentioned future date exchange rate {string}")
	public void i_hit_the_API_URL_for_the_mentioned_future_date_exchange_rate(String futuredate) {
		testcontext.resp = testcontext.req_spec.when().get(futuredate);
		//testcontext.scn.write("Response of the request is :" + testcontext.resp.asString() + "<br>")
		testcontext.scn.log("Response of the request is :" + testcontext.resp.asString() + "<br>");
	}

	@Then("API returns the success response with status code as {int}")
	public void api_returns_the_success_response_with_status_code_as(Integer int1) {
		testcontext.resp.then().assertThat().statusCode(200);
	}

	@Then("The response with Current date is received")
	public void the_response_with_Current_date_is_received() {
		testcontext.resp.then().assertThat().body("date", equalTo(Currentdate));
	}

}
