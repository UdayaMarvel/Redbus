package in.redbus.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import in.redbus.reusable.CommonFunction;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;



public class Hooks {
	CommonFunction co = new CommonFunction();
	
@Before
public void browserStart(Scenario scenario) {
	co.browserLaunch();
	final byte[] source = ((TakesScreenshot)co.driver).getScreenshotAs(OutputType.BYTES);
//	scenario.embed(source,"image/png");
}

@After
public void browserEnd(Scenario scenario) {
//	co.browserClose();

	final byte[] source = ((TakesScreenshot)co.driver).getScreenshotAs(OutputType.BYTES);
//	scenario.   embed(source,"image/png");
}
}
