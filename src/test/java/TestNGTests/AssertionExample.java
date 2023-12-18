package TestNGTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample {

	@Test
	public void Tc_verifyTitle() {
		WebDriver driver = null ;
		String browser = "edge";
		SoftAssert softAssert = new SoftAssert();
		if(browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}	
		
		driver.manage().window().maximize();

		driver.get("https:/google.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//Assert.assertEquals(title, "Gogle");
		
		//Assert.assertEquals(true, true);
		
		softAssert.assertEquals(title, "Gogle");
		
		System.out.println("next assertion");
		
		softAssert.assertEquals(true, true);
		
		softAssert.assertAll();
		
		
	}
	
}
