package exchangeratetest.stepdef;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.cucumber.java.en.*;

import exchangeratetest.runner.TestBase;

public class LatestExchangeRate extends TestBase {

	TestContext testcontext;

	public LatestExchangeRate(TestContext testcontext) {
		this.testcontext = testcontext;
	}

	@Given("Currency Exchange rate API is up and running")
	public void currency_exchange_rate_api_is_up_and_running() {
		testcontext.req_spec = given().baseUri(server);

	}

	@When("I hit the API URL for the latest currency exchange rates with endpoint as {string}")
	public void i_hit_the_API_URL_for_the_latest_currency_exchange_rates_with_endpoint_as(String endPoint) {
		testcontext.resp = testcontext.req_spec.when().get(endPoint);
		testcontext.scn.log("The API URL hit for getting the Response is :"+ server+endPoint);

	}

	@Then("API returns the response with status code as {int}")
	public void api_returns_the_response_with_status_code_as(Integer int1) {
		testcontext.resp.then().assertThat().statusCode(int1);
		testcontext.scn.log("Status Code received is :" + testcontext.resp.statusCode());
	}

	@Then("Response is getting pulled with all the exchange rate data for different currencies")
	public void response_is_getting_pulled_with_all_the_exchange_rate_data_for_different_currencies() {
		testcontext.resp.then().assertThat().statusCode(200).body("rates", not(emptyArray()));
		testcontext.scn.log("Response for the request is :" + testcontext.resp.asPrettyString() + "<br>");
	}

}
