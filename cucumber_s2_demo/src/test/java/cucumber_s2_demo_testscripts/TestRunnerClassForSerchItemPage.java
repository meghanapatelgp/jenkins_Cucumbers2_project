package cucumber_s2_demo_testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "Features//SearchItem.feature",

		
				//dryRun=true,
		
		glue = {"cucumber_s2_demo_testscripts"},
		
		
		plugin= {"pretty","html:target/CucumberReportForForSerchItemPag.html"}
		)

public class TestRunnerClassForSerchItemPage extends AbstractTestNGCucumberTests {
}