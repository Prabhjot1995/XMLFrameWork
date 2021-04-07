package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class DashBoardTest {
	WebDriver driver;

	@Test
	@Parameters({ "FirstName", "LastName" })
	public void dashboardbuttons(String firstname, String lastname) {
		driver = BrowserFactory.init();
		LoginPage page = PageFactory.initElements(driver, LoginPage.class);
		page.PageTitle();
		page.firstname(firstname);
		page.lastname(lastname);
		page.submit();

		DashBoardPage dash = PageFactory.initElements(driver, DashBoardPage.class);
		dash.verifydashboardheader();
		dash.clickonbankbutton();
		dash.clickonaddcustomer();
	}
}
