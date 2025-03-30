package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.BaseClass;

public class LoginPage extends BaseClass {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[contains(@id,'username')]")
	WebElement usernameField;

	@FindBy(xpath = "//button[contains(@class,'continueButton')]")
	WebElement clickContinue;

	@FindBy(id = "password")
	WebElement passwordField;

	@FindBy(xpath = "//button[contains(@type,'submit')]")
	WebElement LoginBtn;

	public void enterUsername(String Username) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(usernameField)).sendKeys(Username);
	}

	public void clickContinueBtn() {
		clickContinue.click();
	}

	public void enterPassword(String Password) {
		passwordField.sendKeys(Password);
	}

	public void clickLoginBtn() {
		LoginBtn.click();
	}

}
