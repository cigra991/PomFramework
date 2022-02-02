package symphony.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import symphony.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//input[@type=\"text\"]")
	WebElement search;
	
	@FindBy(name="//input[@name=\"q\"]")
	WebElement searchButton;
	
	@FindBy(xpath="//a[@href=\"/careers\" and @class='header--nav-link']")
	WebElement symLink;
	
	
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void Search() {
		
		search.sendKeys("symphony.is");
		search.sendKeys(Keys.RETURN);
		symLink.click();
		
	}
	

	
	

	

}
