package cucumber_s2_demo_pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	@FindBy(partialLinkText="Log in")
	private WebElement logInBtn;
	@FindBy(id="Email")
	private WebElement emailTextBox;
	@FindBy(id="Password")
	private WebElement passwordTextBox;

	private final WebDriver driver;
    private final JavascriptExecutor executor; // Initialize the JavascriptExecutor

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.executor = (JavascriptExecutor) driver; // Initialize the JavascriptExecutor
        PageFactory.initElements(driver, this);
    }

    public void clickOnLogin() {
        // Use JavaScript to click on the element
        executor.executeScript("arguments[0].click();", logInBtn);
    }

	public void clickOnEmailBox(String email) {
		emailTextBox.clear();
		emailTextBox.sendKeys(email);
		
	}
	public void clickOnPasswordBox(String password) {
		emailTextBox.clear();
		emailTextBox.sendKeys(password);
		
	}
}