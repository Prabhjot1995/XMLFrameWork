package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	WebDriver driver;

	@Test
	@Parameters({ "FirstName", "LastName", "Account Name", "Description", "Balance", "Account Num", "Contact", "Phone",
			"Url" })
	public void usershouldabletoaddcustomer(String firstname, String lastname, String account, String desc,
			String balance, String accountnum, String contact, String phone, String url) {
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

		AddCustomerPage add = PageFactory.initElements(driver, AddCustomerPage.class);
		add.account(account);
		add.description(desc);
		add.balance(balance);
		add.accountnum(accountnum);
		add.contact(contact);
		add.phone(phone);
		add.url(url);
		add.submit();

	}
}
