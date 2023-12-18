package TestNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DependsonExample {

	
	@Test ()
	public void TC_login() {
		
		WebDriver driver = null ;
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}	
		
		driver.manage().window().maximize();

		driver.get("https://google.com");
		driver.findElement(By.id("APjq")).sendKeys("Rahul Automation");
		
	}
	
	@Test (dependsOnMethods = { "TC_login" },alwaysRun =true)
	public void TC_login1() {
		
		WebDriver driver = null ;
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}	
		
		driver.manage().window().maximize();

		driver.get("https://facebook.com");
		
	}
	
	
}
