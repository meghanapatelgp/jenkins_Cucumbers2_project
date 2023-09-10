package cucumber_s2_demo_testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber_s2_demo_pages.SearchItemPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchItemSteps {
	private WebDriver driver;
	private SearchItemPage searchItemPage;
	@Given("User navigates to the website")
	public void user_navigates_to_the_website() {
		 driver = new ChromeDriver();
	        driver.get("https://demowebshop.tricentis.com/"); 
	        searchItemPage = new SearchItemPage(driver);
	}

	@When("User clicks on the {string} link")
	public void user_clicks_on_the_link(String string) {
		searchItemPage.clickOnBooksLink();
	}

	@When("User enters {string} into the search field")
	public void user_enters_into_the_search_field(String string) {
		searchItemPage.clickOnsearchBox("Fiction");
	}

	@When("User clicks the {string} button")
	public void user_clicks_the_button(String string) {
		searchItemPage.clickOnsearchBtn();
	}

	@When("User selects the first search result")
	public void user_selects_the_first_search_result() {
		searchItemPage.clickOnFirstItem();
	}

	@When("User clicks on the {string} button")
	public void user_clicks_on_the_button(String string) {
		searchItemPage.clickoncartBtn();
	}
	
	@Then("User close the browser")
	public void user_close_the_browser() {
		driver.quit();
	}

}
