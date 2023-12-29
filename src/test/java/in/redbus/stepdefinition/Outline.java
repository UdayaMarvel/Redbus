package in.redbus.stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeOptions;

import in.redbus.reusable.CommonFunction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Outline {

	CommonFunction co = new CommonFunction();

	@When("User enters a From place in From Input TxBx {string}")
	public void user_enters_a_from_place_in_from_input_tx_bx(String fromPlace) throws Throwable {
		File file = new File(".\\src\\test\\resources\\Credentials.property");
		FileInputStream fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
		String user = prop.getProperty("username");
		String pass = prop.getProperty("password");
		System.out.println("Username :"+user+ " "+"Password :"+pass);
		
		FileOutputStream fileout = new FileOutputStream(file);
		prop.setProperty("username", "Marvel");
		prop.setProperty("password", "0987654321");
		prop.setProperty("sqlhost", "mssql:12020");
		prop.setProperty("env", "qa");
		
		prop.save(fileout, "updated env");
		
		 WebElement from = co.driver.findElement(By.id("src"));
		   from.sendKeys(fromPlace);
		   WebElement returnFrom = co.driver.findElement(By.xpath("//text[text()='"+fromPlace+"']"));
		   returnFrom.click();
	}

	@When("User enters a To place in To Input TxBx {string}")
	public void user_enters_a_to_place_in_to_input_tx_bx(String toPlace) {
		WebElement to = co.driver.findElement(By.id("dest"));
		   to.sendKeys(toPlace);
		   WebElement returnTo = co.driver.findElement(By.xpath("//text[text()='"+toPlace+"']"));
		   returnTo.click();
	}

	@When("User Selects a date in the calendar dropdown {string}")
	public void user_selects_a_date_in_the_calendar_dropdown(String date) {
		WebElement dateDropdown = co.driver.findElement(By.xpath("//span[text()='"+date+"']"));
		dateDropdown.click();
	}
	
}
