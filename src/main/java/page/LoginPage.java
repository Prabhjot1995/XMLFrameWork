package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//input[@id='username']")
	WebElement FIRST_NAME_FEILD;
	@FindBy(xpath = "//input[@id='password']")
	WebElement LAST_NAME_FEILD;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement SUBMIT_BUTTON;

	public void PageTitle() {
		Assert.assertEquals(driver.getTitle(), "Login - iBilling", "Page Not Found!!");
	}

	public void firstname(String name) {
		FIRST_NAME_FEILD.sendKeys(name);
	}

	public void lastname(String last) {
		LAST_NAME_FEILD.sendKeys(last);
	}

	public void submit() {
		SUBMIT_BUTTON.click();
	}
}
