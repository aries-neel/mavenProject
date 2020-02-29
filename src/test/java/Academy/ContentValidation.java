package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.FunctionLibrary;



public class ContentValidation extends FunctionLibrary {

	public static Logger log=LogManager.getLogger((ContentValidation.class.getName()));
	
    LandingPage lp;
    
    
    @BeforeMethod
	public void launch() throws IOException {
    	driver=intializeDriver();				   	// from function library class through inheritance 	
		driver.get("http://qaclickacademy.com/");
			}
	
	
	@Test(description="contentValidation")
	public void contentValidation() {
	
		lp=new LandingPage(driver);
		String actual_content=lp.getTitle().getText();
		String exp_content="Featured Courses";
		Assert.assertEquals(exp_content.toUpperCase(),actual_content );
		log.info("content is validated in landing page  ::" );
		
	}
	@AfterMethod
	public void tearDown() {
		
		driver.close();
		
		 
	}
	
		
	}
	
	
	

