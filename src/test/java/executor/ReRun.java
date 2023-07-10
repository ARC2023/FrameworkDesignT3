package executor;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"@target/failedcases.txt"},
		glue= {"stepdefinition","hooks3"},
		plugin= {"pretty","rerun:target/failedcases.txt"}	
		
		)
public class ReRun {

}
