package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtil {
	
	/*To read the properties file we need to follow certain steps
	step 1: create one static method to access the value of key from properties file 
	step 2: on that object call load method and pass the file location of properties file
	step 3: Get the value using getproperty() and return this to the calling method 
	
	*/
	
	
	
	public static String getPropertyValue(String Key) throws Exception {
		Properties prop=new Properties();
		prop.load(new FileInputStream(new File("C:\\Users\\NEELMANI\\Project\\src\\main\\java\\resources\\Environment.properties")));
		String value=prop.getProperty(Key);
		return value;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
