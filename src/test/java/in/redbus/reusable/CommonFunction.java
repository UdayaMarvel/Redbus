package in.redbus.reusable;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.base.Throwables;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunction implements ICommonFunction{
	public static WebDriver driver;
	public static JavascriptExecutor js ;
	public static Actions a;
	public static Select s;
	
	public void browserLaunch() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-popups");
		options.addArguments("--disable-notifications");
//		options.addArguments("--headless");
		driver = new EdgeDriver(options);
		js = (JavascriptExecutor)driver;
		a = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public void browserClose() {
		driver.close();
	}

	public void sendtext(WebElement e, String value) {
		e.sendKeys(value);
	}
	public void sendtext(String value, WebElement e) {
		
		a.sendKeys(e, value).build().perform();
	}
	public void sendtext(WebElement e, String value,int i) {
		
		js.executeScript("arguments[0].setAttribute('value',"+value+")", e);
	}
	public void sendtext(Alert a, String value) {
		a.sendKeys(value);
	}

	public void button(WebElement e) {
		e.click();
	}

	public void movetoElement() {
		// TODO Auto-generated method stub
		
	}

	public void scrollDown() {
		// TODO Auto-generated method stub
		
	}

	public void scrollUp() {
		// TODO Auto-generated method stub
		
	}

	public void ss(String x) throws Throwable{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File f = new File(".\\target\\"+x+".png");
		FileUtils.copyFile(source, f);
	}

	public void handleWindows(String parentWindow) {
		driver.switchTo().window(parentWindow);
	}

	public void selectIndexInDropDown(WebElement e, int i) {
		s = new Select(e);
		s.selectByIndex(i);
		
	}

	public void selectVisibleTextInDropdown(String value, WebElement e) {	
		s = new Select(e);
		s.selectByVisibleText(value);
	}

	public void displayed() {
		// TODO Auto-generated method stub
		
	}

	public void enabled() {
		// TODO Auto-generated method stub
		
	}

	public void selected() {
		// TODO Auto-generated method stub
		
	}

	public String gettext(WebElement e) {
		String text = e.getText();
		return text;
	}

	public String attributeFromElement(WebElement e, String attributeName) {
		String attribute = e.getAttribute(attributeName);
		return attribute;
	}

	public void button(WebElement e, int i) {
		js.executeScript("arguments[0].click()",e);
	}

	public void button(int i, WebElement e) {
		a.click(e).build().perform();
		
	}

	public void handleWindows() {
		// TODO Auto-generated method stub
		
	}

	

}
