package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DashBoardPage {
	WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//h2[text()=' Dashboard ']")
	WebElement DASHBOARD_HEADER;
	@FindBy(xpath = "//span[text()='Bank & Cash']")
	WebElement BANK_CASH_BUTTON;
	@FindBy(xpath = "//a[text()='New Account']")
	WebElement ADD_CUSTOMER_BUTTON;

	public void verifydashboardheader() {
		Assert.assertEquals(DASHBOARD_HEADER.getText(), "Dashboard", "DashBoard header not found!!");
	}

	public void clickonbankbutton() {
		BANK_CASH_BUTTON.click();
	}

	public void clickonaddcustomer() {
		ADD_CUSTOMER_BUTTON.click();
	}
}
