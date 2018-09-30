package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/madarafreimane/Desktop/php-travels-MFreimane-final/src/test/resources/features",
        glue = {"step_definitions"}
//        tags = {"@TEST"}
)
public class TestRunner {
}