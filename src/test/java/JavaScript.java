import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\selenium\\target\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String s = "https://www.facebook.com/";
		driver.navigate().to(s);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement user = driver.findElement(By.id("email"));
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','kirthik')",user,login );
	    js.executeScript("arguments[0].setAttribute('style','background:yellow;border:2px solid red')",user,login );
	   
	    Object o = js.executeScript("return arguments[0].getAttribute('value')",user,login );
	    System.out.println(o);
	    
	    WebElement down = driver.findElement(By.xpath("//a[text()='Careers']"));
	    js.executeScript("arguments[0].scrollIntoView(true)",down );
	    Thread.sleep(2000);
	    
	    js.executeScript("arguments[0].scrollIntoView(false)",user );
	    
	}
}


