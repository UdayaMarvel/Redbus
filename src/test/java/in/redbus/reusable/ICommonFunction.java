package in.redbus.reusable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

public interface ICommonFunction {

	public void browserLaunch();
	public void browserClose();
	public void sendtext(WebElement e, String value);
	public void sendtext(WebElement e, String value,int i);
	public void sendtext(Alert a, String value);
	public void button(WebElement e);
	public void movetoElement();
	public void scrollDown();
	public void scrollUp();
	public void button(WebElement e, int i);
	public void button(int i, WebElement e);
	public void ss(String x) throws Throwable;
	public void handleWindows();
	public void selectIndexInDropDown(WebElement e, int i);
	public void selectVisibleTextInDropdown(String value, WebElement e);
	public void displayed();
	public void enabled();
	public void selected();
	public String gettext(WebElement e);
	public String attributeFromElement(WebElement e, String attributeName);
}
