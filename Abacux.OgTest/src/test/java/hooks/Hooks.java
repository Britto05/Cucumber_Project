package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import webDriverManager.DriverManager;

public class Hooks extends DriverManager{
	
	@After
	public static void tearDown(Scenario scenario) {
	 
	        //validate if scenario has failed
	        if(scenario.isFailed()) {
	             byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", scenario.getName()); 
	        } 
	}
}
	
	//String report1= "Primary Mobile No Validation Failed, Mobile no accept more then ten numbers";
	
	//@After	
	//public static void afterStep(Scenario scenario) throws IOException
	//{
	//	boolean fail = scenario.isFailed();
		//	if(fail)
	//{					
	//	 byte[] screenshot = ((TakesScreenshot)webDriverManager.DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
	//	 scenario.attach(screenshot, "image/png", scenario.getName());
			 //scenario.log(report1);
			 
	//	}	
	//}	

