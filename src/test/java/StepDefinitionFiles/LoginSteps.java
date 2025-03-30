package StepDefinitionFiles;

import Utilities.BaseClass;
import io.cucumber.java.en.*;
import junit.framework.Assert;

import org.openqa.selenium.WebDriver;

import Pages.LoginPage;

public class LoginSteps extends BaseClass {

	WebDriver driver = initializeDriver();
	LoginPage obj = new LoginPage(driver);

	@Given("Launch the application")
	public void launch_the_application() {
		System.out.println("Open MRS Application Launched fine");
	}

	@Then("User is able to see login page")
	public void user_is_able_to_see_login_page() {
		String title = getTitle();
		System.out.print(title);
		Assert.assertEquals(title, "OpenMRS");
	}

	@When("User enters username in username field as {string}")
	public void user_enters_username_in_username_field(String Username) {
		obj.enterUsername(Username);
		obj.clickContinueBtn();
	}

	@When("User enters password in password field as {string}")
	public void user_enters_password_in_password_field(String Password) {
		obj.enterPassword(Password);
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		obj.clickLoginBtn();
		closeDriver();
	}

}

