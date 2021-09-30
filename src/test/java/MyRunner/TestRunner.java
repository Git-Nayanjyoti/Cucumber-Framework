package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "./src/test/java/Features/Login.feature",
		glue = "StepDefinition",
		plugin = {"pretty","html:Reports/HTMLReport.html","json:Reports/Jsonreport.json",
				"junit:Reports/JUnitreport.junit"}
		)

public class TestRunner {

}
