package exchangeratetest.stepdef;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;
import io.cucumber.java.en.*;
import static org.hamcrest.Matchers.*;

import io.cucumber.java.Scenario;


import exchangeratetest.runner.TestBase;
import io.restassured.response.Response;
import exchangeratetest.runner.TestBase;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class StepDefIncorrectURL extends TestBase {

	TestContext testcontext;

	public StepDefIncorrectURL(TestContext testcontext) {
		this.testcontext = testcontext;
	}

	@Given("Exchange rate API is up and running")
	public void exchange_rate_api_is_up_and_running() {
		testcontext.req_spec = given().baseUri(server);
	}

	@When("I hit the API URL with endpoint as {string}")
	public void i_hit_the_api_url_with_endpoint_as(String string1) {
		testcontext.resp = testcontext.req_spec.when().get(string1);
		testcontext.scn.log("Response of the request is :" + testcontext.resp.asString() + "<br>");
	}

	@Then("API Error Code {int} should be displayed")
	public void api_error_code_should_be_displayed(Integer int1) {
		testcontext.resp.then().assertThat().statusCode(int1);
	}

}
