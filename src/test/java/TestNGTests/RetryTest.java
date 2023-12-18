package TestNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class RetryTest {

	//@Test(retryAnalyzer=TestNGTests.MyRetryClass.class)
	@Test
	public void TC_Login() {
		WebDriver driver = null ;
		String browser = "chrome";
		//SoftAssert softAssert = new SoftAssert();
		if(browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}	
		
		driver.manage().window().maximize();

		driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
		
		driver.findElement(By.id("tet")).sendKeys("dfdfdf");
		driver.findElement(By.id("password")).sendKeys("fsffsf");
		
		}


@Test
public void TC_Login1() {
	WebDriver driver = null ;
	String browser = "chrome";
	//SoftAssert softAssert = new SoftAssert();
	if(browser.equalsIgnoreCase("chrome")) {
	driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
	}	
	
	driver.manage().window().maximize();

	driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
	
	driver.findElement(By.id("text")).sendKeys("dfdfdf");
	driver.findElement(By.id("password")).sendKeys("fsffsf");
	
	}
}
