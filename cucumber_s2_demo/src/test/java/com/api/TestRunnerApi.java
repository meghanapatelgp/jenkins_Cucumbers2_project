package com.api;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

	@RunWith(Cucumber.class)
	@CucumberOptions(
	    features = "Feature/ErgastAPITest.feature",
	    glue = "com.api",
	    plugin = {"pretty", "html:target/cucumber-reports"}
	)
	public class TestRunnerApi {
	}

