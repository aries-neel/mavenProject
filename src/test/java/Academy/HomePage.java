package Academy;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.FunctionLibrary;

public class HomePage extends FunctionLibrary  {
	
	 /*In order to us the other class methods which is present in some package we can do so by inheritance concept
	  so here we have created an object for the class landing in order to access its functionality
	 so basically the getlogin()== driver.findElement(by.locator_type) defined in so other package.class 
	 and here we are calling for action which differs based on scenarios.
	 if there is a set of data and we want to test there data for a testcase with multiple possibility then we should go for 
	 dataProvider testNg annotation and  drive these test case from there to our test case*/
	
	LandingPage lp;
	
	public static Logger log=LogManager.getLogger((HomePage.class.getName()));
	
	 @BeforeMethod
		public void launch() throws IOException {
		 	driver=intializeDriver();					
			driver.get("http://qaclickacademy.com/");
			
		}
	
	
	@Test(dataProvider="LoginValidation")
	public void baseLoginPage(String username , String Password ) throws IOException  {
		
		lp=new LandingPage(driver);										// through import of pageObject .LandingPage class 
		lp.getlogin().click();									
		LoginPage login =new LoginPage(driver);
		login.getEmail().sendKeys(username);
		login.getPassword().sendKeys(Password);
		login.getLogin().click();
		log.info("entered username and password on Home page ::"+username+"   "+ Password);
		
	}
	
	/*how to create one dataProvider?
	 
	 step 1: first give @Dataprovider and create a method with any name whose return type should match with the arguments of calling @test
	 		 like here String and String arguments of baseLoginPage()
	 
	step 2 :first keep in mind to create an Array two dimensional array in which [row] [column] where:row=how many iteration 
	 																								 column= number of data sets
	    
	step 3: 	  Add the data in the array object   best practice	new Object[][] {{"neelmani","singh"},{"neelmani","123445"}};																				 
		    																					 
	*/
	
	@DataProvider(name="LoginValidation")
	public Object[][] getParametrizedData() {
		/*Object[][] paraData= new Object [2][2];
		paraData[0][0]="neelmani";
		paraData[0][1]="12345";
		paraData[1][0]="singh";
		paraData[1][1]="23456";*/
		
		//return paraData;
		return new Object[][] {{"neelmani","singh"},{"neelmani","123445"}};
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
		
		 
	}
	
	

}
