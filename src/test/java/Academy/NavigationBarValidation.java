 package Academy;

import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.NavigationPage;
import resources.FunctionLibrary;

public class NavigationBarValidation extends FunctionLibrary {

	public static Logger log=LogManager.getLogger((NavigationBarValidation.class.getName()));
	
	
	@BeforeTest
	public void launch() throws IOException {
		driver=intializeDriver();				
		driver.get("http://qaclickacademy.com/");
		
		
		
	}
	
	@Test(timeOut=6000)
	public void navBarValidation()  {
		
		
		NavigationPage nav=new NavigationPage(driver);
		List<WebElement> elements=nav.getNavigationBar();
		
		 for(WebElement each:elements) {
			 String act_val=each.getText();
			   if(act_val.equalsIgnoreCase("Practice")) {
				   
				   log.info("options is  matched ::"+act_val );
				   Assert.assertTrue(true);
				  
				   break;
			   }
			   else {
				   
				  System.out.println("options is ::"+act_val);
			   }
		 }
	}
	@AfterMethod
	public void tearDown() {
		
		driver.close();
		
		
	}
	
	
	
}
