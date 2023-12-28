package in.redbus.stepdefinition;

import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeOptions;

import in.redbus.objectRepository.TicketBooking;
import in.redbus.reusable.CommonFunction;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookTickets extends CommonFunction{
	CommonFunction co = new CommonFunction();
	TicketBooking tk =  new TicketBooking();
	
	@Given("Launch the RedBus {string}")
	public void launch_the_red_bus(String url) throws Throwable {
		co.driver.get(url);
		co.ss("launch");
	}
	
	@When("User enters a From place in From Input TxBx With one dim list")
	public void user_enters_a_from_place_in_from_input_tx_bx_with_one_dim_list(DataTable Listtestdata) throws Throwable {
		
		List<String> list = Listtestdata.asList();
		String fromPlace = list.get(1);
		   co.sendtext(tk.getFrom(), fromPlace);
		   WebElement returnFrom = co.driver.findElement(By.xpath("//text[text()='"+fromPlace+"']"));
		   returnFrom.click();
		  co.ss("from");
	}

	@When("User enters a To place in To Input TxBx with one dim Map")
	public void user_enters_a_to_place_in_to_input_tx_bx_with_one_dim_map(DataTable MapTestData) throws Throwable {
		Map<String, String> map = MapTestData.asMap(String.class, String.class);
		String toPlace = map.get("place3");
		   co.sendtext(tk.getTo(), toPlace);
		   WebElement returnTo = co.driver.findElement(By.xpath("//text[text()='"+toPlace+"']"));
		   returnTo.click();
		   co.ss("to");
	}

	@When("User Selects a date in the calendar dropdown")
	public void user_selects_a_date_in_the_calendar_dropdown() throws Throwable {
		co.button(tk.getDate());
		co.ss("search");
		}

	@And("User clicks on search buses")
	public void user_clicks_on_search_buses() throws Throwable {
		co.button(tk.getSearch());
		co.ss("result");
	}

	@Then("Validate the From place, To place and Date")
	public void validate_the_from_place_to_place_and_date() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
