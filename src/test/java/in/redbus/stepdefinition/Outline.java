package in.redbus.stepdefinition;

import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.SQLException;
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
	public void user_enters_a_from_place_in_from_input_tx_bx(String fromPlace) {
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
