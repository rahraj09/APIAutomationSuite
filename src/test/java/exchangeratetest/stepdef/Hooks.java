package exchangeratetest.stepdef;

import io.cucumber.java.Scenario;

import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hooks {

	TestContext testcontext;

	public Hooks(TestContext testcontext) {
		this.testcontext = testcontext;
	}

	@Before
	public void setUp(Scenario s) {
		this.testcontext.scn = s;
	}

	@After
	public void cleanUp(Scenario s) {
		testcontext.req_spec = null;
		testcontext.resp = null;
	}

}
