package in.redbus.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.redbus.reusable.CommonFunction;

public class TicketBooking extends CommonFunction{

	public TicketBooking() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="src")
	private WebElement from;
	
	
	@FindBy(id="dest")
	private WebElement to;
	

	@FindBy(xpath = "//span[text()='10']")
	private WebElement date;
	
	@FindBy(id = "search_button")
	private WebElement search;

	public WebElement getFrom() {
		return from;
	}


	public WebElement getTo() {
		return to;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getSearch() {
		return search;
	}
	
}
