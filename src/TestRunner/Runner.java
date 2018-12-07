package TestRunner;		
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features="Features/MyTest.feature",glue={"StepDefinition"},
plugin={"pretty","html:target/reports"})

public class Runner 
{
}
