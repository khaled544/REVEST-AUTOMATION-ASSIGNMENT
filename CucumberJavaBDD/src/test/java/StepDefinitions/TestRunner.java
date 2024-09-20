package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
 @CucumberOptions(features="src/test/resources/Features",glue= {"src/test/java/StepDefinitions"},
 monochrome=true,
 plugin = {"pretty",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			"timeline:test-output-thread/"}


 )

public class TestRunner {
	
	

}
