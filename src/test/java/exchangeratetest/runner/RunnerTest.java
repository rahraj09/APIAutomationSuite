package exchangeratetest.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

import io.cucumber.junit.CucumberOptions;

/* For HTML results of the execution run refer the path --->target/html/index.html*/



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", 
                 glue = { "exchangeratetest.stepdef" }, 
                 plugin = {"pretty",
                		   "json:target/MyReports/report.json",
                		   "junit:target/MyReports/report.xml",
                		   //"html:target/MyReports/report.html"
                		   },
                 publish=true

)
public class RunnerTest {

	// "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}
