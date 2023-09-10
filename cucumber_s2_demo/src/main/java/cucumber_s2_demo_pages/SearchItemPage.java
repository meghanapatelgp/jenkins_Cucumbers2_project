package cucumber_s2_demo_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchItemPage {
	@FindBy(linkText="BOOKS")
	private WebElement clickOnBookLink;
	
	@FindBy(id="small-searchterms")
	private WebElement searchTextBox;
	
	@FindBy(xpath="//input[contains(@class,'button-1 search-box-button')]")
	private WebElement searchBtn;
	
	@FindBy(linkText="Fiction")
	private WebElement clickOnfirstItem;
	
	@FindBy(id="add-to-cart-button-45")
	private WebElement addCartBtn;

	

    public SearchItemPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
    public void clickOnBooksLink() {
    	clickOnBookLink.click();
    }
    
    public void  clickOnsearchBox(String book) {
    	searchTextBox.sendKeys(book);
    }
    public void  clickOnsearchBtn() {
    	searchBtn.click();
    	
    }
    public void clickOnFirstItem() {
    	clickOnfirstItem.click();
    }
    public void clickoncartBtn() {
    	addCartBtn.click();
    }
}