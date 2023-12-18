package Login;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Capabilities.CapabilityBase;
import POM.LoginPageObject;

public class LoginTest extends CapabilityBase{
	
	LoginPageObject loginPageObject = new LoginPageObject();
	
	@Test
	public void TC_login() throws InterruptedException {
		
		baseClass.get(testData.get("url"));

		Thread.sleep(2000);
		baseClass.maximize(extentTest, "browser has been maximize");
		login.login(testData.get("username"), testData.get("password"));
		login.Submit();

		Thread.sleep(1000);
	}
	
	@Test
	public void TC_login1() throws InterruptedException {
		baseClass.get(testData.get("url"));

		Thread.sleep(2000);
		baseClass.maximize(extentTest, "browser has been maximize");
		login.login(testData.get("username"), testData.get("password"));
		login.Submit();

		Thread.sleep(1000);
		
	}

}
