package runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java/featureFiles"
		,glue={"stepDefination"},
		dryRun= false,
		monochrome = true,
		plugin = {"html:target/cucumber-html-report", 
				"json:target/cucumber-json-report.json" }
		)


public class TestRunner {
	
	

}
