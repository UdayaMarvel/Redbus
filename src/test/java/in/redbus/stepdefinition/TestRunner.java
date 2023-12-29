package in.redbus.stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\src\\test\\resources\\",
					glue= "in.redbus.stepdefinition",
					dryRun = false,
					monochrome = true,
					plugin = {"html:target/index.html","json:target/report.json"})
public class TestRunner {

}
