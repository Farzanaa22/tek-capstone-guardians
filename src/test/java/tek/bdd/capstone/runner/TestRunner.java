package tek.bdd.capstone.runner;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		
		tags= (""),
		features = ("classpath:features"),
		glue = "tek-capstone-guardians",
		dryRun = true,
		plugin = {
				"pretty",
				"html:target/htmlReports/cucumber-pretty.html",
				"json:target/jsonReports/cucumber.json"
		},
	    snippets = CAMELCASE,
		monochrome = true
				
		)




public class TestRunner {

}
