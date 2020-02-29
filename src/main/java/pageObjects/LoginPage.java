package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	/*every page will have its own constructor locators and the method to handle that page*/
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		 this.driver=driver;
		
	}
	
	By email=By.id("user_email");
	By password=By.id("user_password");
	By login=By.xpath(".//*[@value='Log In'] ");
	
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	public WebElement getLogin() {
		return driver.findElement(login);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
