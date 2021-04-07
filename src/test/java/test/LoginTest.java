package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;

	@Test
	@Parameters({ "FirstName", "LastName" })
	public void usershouldabletologin(String firstname, String lastname) {
		driver = BrowserFactory.init();

		LoginPage page = PageFactory.initElements(driver, LoginPage.class);
		page.PageTitle();
		page.firstname(firstname);
		page.lastname(lastname);
		page.submit();

	}
}
