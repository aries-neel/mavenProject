package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	/*All locator object of this landing page should be present in this page only 
	Also the most important aspect of this page is that we need a constructor to initialize the driver as here only declaring 
	is not enough as of now driver as webdriver reference but there is no implementation for it so to initialize we need constructor*/
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	By sigin=By.cssSelector("a[href *='sign_in']");
	By title=By.xpath("//div[@class='text-center']/h2");
	
	
	public WebElement getlogin() {
		return driver.findElement(sigin);
	}
	
	public WebElement getTitle() {
		
		return driver.findElement(title);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
