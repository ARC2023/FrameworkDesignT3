package executor;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src\\test\\resources\\OrderPlace\\"},
		glue= {"stepdefinition","hooks3"},
		plugin= {"pretty"}	
		
		)

public class TestExecutor {

}
