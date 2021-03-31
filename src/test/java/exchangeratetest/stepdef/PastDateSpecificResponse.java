package exchangeratetest.stepdef;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import exchangeratetest.runner.TestBase;

public class PastDateSpecificResponse extends TestBase {

	TestContext testcontext;

	public PastDateSpecificResponse(TestContext testcontext) {
		this.testcontext = testcontext;
	}

	String date;

	@Given("Currency-Exchange rate API is up and running")
	public void currency_Exchange_rate_API_is_up_and_running() {
		testcontext.req_spec = given().baseUri(server);
	}

	@When("I hit the API URL for the specific date exchange rate with endpoint as {string}")
	public void i_hit_the_API_URL_for_the_specific_date_exchange_rate_with_endpoint_as(String date) {
		testcontext.resp = testcontext.req_spec.when().get(date);
		testcontext.scn.log("The API URL hit for getting the Response is :"+ server+date);

	}

	@Then("API return the response with status code as {int}")
	public void api_return_the_response_with_status_code_as(Integer int1) {
		testcontext.resp.then().assertThat().statusCode(200);
		int actualstatuscode = testcontext.resp.getStatusCode();

		testcontext.scn.log("Status Code received is :" + actualstatuscode);
	}

	@Then("Response is getting pulled for the specific date")
	public void response_is_getting_pulled_for_the_specific_date() {
		JsonPath jsonPathEvaluator = testcontext.resp.jsonPath();
		String datereceived = jsonPathEvaluator.get("date");
		testcontext.resp.then().assertThat().statusCode(200).assertThat().body("rates", not(emptyArray())).assertThat()
				.body("date", equalTo(datereceived));
		testcontext.scn.log("Response of the request is :" + testcontext.resp.asPrettyString() + "<br>");

	}

}
