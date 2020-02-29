package pageObjects;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import resources.FunctionLibrary;

public class NavigationPage extends FunctionLibrary {
	
	By NavigationBar=By.xpath("//ul[@class='nav navbar-nav navbar-right']");
 public	WebDriver driver;
	
	public NavigationPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public  List<WebElement> getNavigationBar() {
	     WebElement taskbar=driver.findElement(NavigationBar);
	     List<WebElement>  taskbar_options =taskbar.findElements(By.tagName("li"));
	      System.out.println(taskbar_options.size());
	     return taskbar_options ;
}
	
	
	
	
	
	
	

	}
	
	
	
	
	
	
	


