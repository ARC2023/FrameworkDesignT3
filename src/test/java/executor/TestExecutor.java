package executor;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src\\test\\resources\\OrderPlace\\"},
		glue= {"stepdefinition","hooks3"},
		plugin= {"pretty",
				"rerun:target/failedcases.txt",
				"json:target/cucumber-reports/Cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"		
		}	
		
		)

public class TestExecutor {

}
