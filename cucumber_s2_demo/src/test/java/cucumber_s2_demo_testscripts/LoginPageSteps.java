package cucumber_s2_demo_testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber_s2_demo_pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	private WebDriver driver;
	private LoginPage loginPage;

	@Given("User on the DemoWebShop login page")
	public void user_on_the_demo_web_shop_login_page() {
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		loginPage = new LoginPage(driver);
	}

	@When("User clicks on the login link")
	public void user_clicks_on_the_login_link() {
		loginPage.clickOnLogin();
	}

	@When("User enters {string} as email")
	public void user_enters_as_email(String string) {
		loginPage.clickOnEmailBox("Itest@test.com");
	}

	@When("User enters {string} as password")
	public void user_enters_as_password(String string) {
		loginPage.clickOnPasswordBox("Itest@test");
	}

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		driver.quit();
	}

}
