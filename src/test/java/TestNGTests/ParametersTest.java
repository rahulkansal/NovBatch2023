package TestNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ParametersTest {
	
	@Parameters({ "username","password" })
	@Test
	public void TC_Login(String userValue, String passValue) {
	WebDriver driver = null ;
	String browser = "edge";
	//SoftAssert softAssert = new SoftAssert();
	if(browser.equalsIgnoreCase("chrome")) {
	driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
	}	
	
	driver.manage().window().maximize();

	driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
	
	driver.findElement(By.id("text")).sendKeys(userValue);
	driver.findElement(By.id("password")).sendKeys(passValue);
	
	}
	
}
