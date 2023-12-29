package in.redbus.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import in.redbus.reusable.CommonFunction;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;



public class Hooks {
	CommonFunction co = new CommonFunction();
	
@Before
public void browserStart(Scenario scenario) {
	co.browserLaunch();
	final byte[] initial = ((TakesScreenshot)co.driver).getScreenshotAs(OutputType.BYTES);
	scenario.embed(initial, "image/png");
}

@After
public void browserEnd(Scenario scenario) {
	final byte[] initial = ((TakesScreenshot)co.driver).getScreenshotAs(OutputType.BYTES);
	scenario.embed(initial, "image/png");
}
}
