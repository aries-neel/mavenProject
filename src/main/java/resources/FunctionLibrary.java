package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;


public class FunctionLibrary {
	
	public static WebDriver driver;
	public static ExtentReporter report;
	
	public WebDriver intializeDriver() throws IOException {
		
		Properties prop= new Properties();
		FileInputStream fin=new FileInputStream("C:\\Users\\NEELMANI\\Project\\src\\main\\java\\resources\\Environment.properties");
		prop.load(fin);
		String BrowserName=prop.getProperty("Browser");
		if(BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			
		}
		else if(BrowserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.driver.firefox", "/Project/drivers/firefoxdriver.exe");
			 driver= new FirefoxDriver();
		}
		
		else if(BrowserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.driver.ie", "/Project/drivers/InternetExplorerdriver.exe");
			driver= new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // as pre condition it is mentioned for the project
		return driver;
	}
	
	public void getScreenShots(String results) throws IOException {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(src, new File("./Screenshots/"+results+"screenshot.png"));
		
		
	}
    
	
}
