package exchangeratetest.stepdef;

import static io.restassured.RestAssured.*;

import io.cucumber.java.en.*;
import io.restassured.response.ValidatableResponse;
import junit.framework.Assert;
import exchangeratetest.runner.TestBase;

public class IncorrectExchangeRateURL extends TestBase {

	TestContext testcontext;

	public IncorrectExchangeRateURL(TestContext testcontext) {
		this.testcontext = testcontext;
	}

	@Given("Exchange rate API is up and running")
	public void exchange_rate_api_is_up_and_running() {
		testcontext.req_spec = given().baseUri(server);
	}

	@When("I hit the API URL with endpoint as {string}")
	public void i_hit_the_api_url_with_endpoint_as(String string1) {
		testcontext.resp = testcontext.req_spec.when().get(string1);
		testcontext.scn.log("The API URL hit for getting the Response is :"+ server+string1);

	}

	@Then("API Status Code {int} should be displayed")
	public void api_Status_code_should_be_displayed(Integer int1) {
		//testcontext.resp.then().assertThat().statusCode(int1);
		testcontext.scn.log("Response Status Code received is :" + testcontext.resp.statusCode());
		testcontext.scn.log("Response error message received is :" + testcontext.resp.asPrettyString() + "<br>");
		testcontext.scn.log("Expected status Code is :"+ 400 +" and "+ "Actual status code is :" + testcontext.resp.statusCode());
		Assert.assertEquals(testcontext.resp.statusCode(), 400);
		
	}

}
