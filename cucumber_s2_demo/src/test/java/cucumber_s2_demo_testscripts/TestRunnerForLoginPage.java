package cucumber_s2_demo_testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "Features//LoginSteps.feature",

		
				//dryRun=true
		
		glue = {"cucumber_s2_demo_testscripts"},
		
		
		plugin= {"pretty","html:target/CucumberReportForLoginPage.html"}
		)

public class TestRunnerForLoginPage extends AbstractTestNGCucumberTests {
}