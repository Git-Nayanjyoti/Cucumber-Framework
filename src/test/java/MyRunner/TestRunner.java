package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/java/Features/Login.feature", glue = "StepDefinition", dryRun = false, plugin = {
		"pretty", "html:Reports/HTMLReport.html", "json:Reports/Jsonreport.json",
		"junit:Reports/JUnitreport.junit" }, tags = "@Test3")

//There are three tags - Test1, Test2, Test3
//Change the value of tags in @CucumberOptions as - tags = "@Test1" or tags = "@Test2" or tags = "@Test3"
//@Test1 is for logging in without parameter
//@Test2 is for logging in with parameter
//@Test3 is for logging in with multiple parameter

/*
 * dryRun -> If we have more than 500 steps and if I changed some steps and I
 * forgot which I changed and then to check that we use dryRun by using dryRun =
 * True, which will give us the error log without running the browser.
 */
public class TestRunner {

}
