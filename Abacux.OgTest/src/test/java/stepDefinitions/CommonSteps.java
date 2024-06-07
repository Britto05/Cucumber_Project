package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import constants.Constants;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pageObjects.LoginPageObjects;
import utilities.CommonUtils;
import webDriverManager.DriverManager;

public class CommonSteps {

	@Before
	public void beforeScenario() {
		try {
			CommonUtils commonUtils = new CommonUtils();
			commonUtils.loadProperties();  
			if(DriverManager.getDriver()==null) { 
				DriverManager.launchBrowser();
				commonUtils.initElements();
				Login();
				DriverManager.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		} 
	}

	private void Login() {
		// TODO Auto-generated method stub
		DriverManager.getDriver().manage().window().maximize();
		DriverManager.getDriver().navigate().to(Constants.Url);
		LoginPageObjects.getInstance();
		LoginPageObjects.getInstance().enterUserName(Constants.UserName);
		LoginPageObjects.getInstance().enterPassword(Constants.Password);
		LoginPageObjects.getInstance().clickLoginButton();
	}

	//@AfterStep
	//public void attachScreenShot(Scenario scenario)  {
		//if(scenario.isFailed()) {
			//byte[]screenshots= ((TakesScreenshot)DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
			//scenario.attach(screenshots, "image/png", "errorscreen"); 
			//DriverManager.getDriver().navigate().back();
		//}
	//}	
}
