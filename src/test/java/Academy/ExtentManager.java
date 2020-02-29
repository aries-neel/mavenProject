package Academy;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	
	    
	    static ExtentReports report;
	    
	    public static ExtentReports getInstance() {
	        return report;
	    }
	    
	    public static ExtentReports createInstance(String fileName) {
	        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./Reports/reports.html");
	      
	       
	        htmlReporter.config().setTheme(Theme.STANDARD);
	        htmlReporter.config().setDocumentTitle("generic report");
	        htmlReporter.config().setEncoding("utf-8");
	        htmlReporter.config().setReportName("neelmani");
	        
	        report = new ExtentReports();
	        report.attachReporter(htmlReporter);
	        
	        return report;
	    }
	    
	}


