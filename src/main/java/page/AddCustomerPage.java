package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage {
	WebDriver driver;

	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//input[@name='account']")
	WebElement ACCOUNT_NUMBER;
	@FindBy(xpath = "//input[@name='description']")
	WebElement DESCRIPTION_FEILD;
	@FindBy(xpath = "//input[@name='balance']")
	WebElement BALANCE_FEILD;
	@FindBy(xpath = "//input[@name='account_number']")
	WebElement ACCOUNT_NUMBER_FEILD;
	@FindBy(xpath = "//input[@name='contact_person']")
	WebElement CONTACT_PERSON_FEILD;
	@FindBy(xpath = "//input[@name='contact_phone']")
	WebElement PHONE_FEILD;
	@FindBy(xpath = "//input[@name='ib_url']")
	WebElement URL_FEILD;
	@FindBy(xpath = "//button[text()=' Submit']")
	WebElement SUBMIT_BUTTON;

	public void account(String account) {
		ACCOUNT_NUMBER.sendKeys(account);
	}

	public void description(String desc) {
		DESCRIPTION_FEILD.sendKeys(desc);
	}

	public void balance(String balance) {
		BALANCE_FEILD.sendKeys(balance);
	}

	public void accountnum(String accountnum) {
		ACCOUNT_NUMBER_FEILD.sendKeys(accountnum);
	}

	public void contact(String contact) {
		CONTACT_PERSON_FEILD.sendKeys(contact);
	}

	public void phone(String phone) {
		PHONE_FEILD.sendKeys(phone);
	}

	public void url(String url) {
		URL_FEILD.sendKeys(url);
	}

	public void submit() {
		SUBMIT_BUTTON.click();
	}
}
