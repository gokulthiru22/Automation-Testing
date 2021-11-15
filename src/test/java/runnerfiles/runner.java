package runnerfiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/featurefile/hirepros_CommonLogin.feature", "src/test/resources/featurefile/hirepros_Configurations.feature"},
glue = "Stepdefinitions", plugin = {
		"pretty", "html:target/htmlreports","json:target/Cucumber.json"})




public class runner {

}
