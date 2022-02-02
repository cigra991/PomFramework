package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import symphony.base.TestBase;
import symphony.pages.HomePage;
import symphony.pages.WebElementi;

public class validacijaTest extends TestBase{
	
	HomePage homePage;
	
	public validacijaTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		initialize();
		homePage = new HomePage();
	}
	
	@Test
	public void Test() {
		
		homePage.Search();
		
		
	}
	
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}
	

}
