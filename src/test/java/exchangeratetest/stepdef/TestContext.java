package exchangeratetest.stepdef;

import io.cucumber.java.Scenario;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestContext {
	
	public RequestSpecification req_spec = null;
	public Response resp = null;
	Scenario scn =null;

}
