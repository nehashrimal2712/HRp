package runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java/featureFiles"
		,glue={"stepDefination"},
		
		plugin = { ("json:target/cucumber-reports/CucumberTestReport.json"),
				( "html:target/cucumber-reports/CucumberTestReport.html") },
		monochrome= true,
		dryRun= false
		)


public class TestRunner {
	
	

}
