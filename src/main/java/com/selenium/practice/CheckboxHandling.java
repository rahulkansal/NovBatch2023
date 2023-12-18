package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckboxHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = null ;
		String browser = "edge";
		
		if(browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}	
		
		driver.manage().window().maximize();

		driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-GOI-22/12/2023&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng");
		
		Thread.sleep(20000);
		
		if(driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']")).isDisplayed())
		{
		driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']")).click();
		}
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//input[@id='listingFilterCheckbox'])[3]")).click();
		
		driver.findElement(By.xpath("(//input[@id='listingFilterCheckbox'])[2]")).click();
		
		driver.findElement(By.xpath("(//input[@id='listingFilterCheckbox'])[2]")).click();
		
		String value="Double Seat";
		
		driver.findElement(By.xpath("//span[text()='Student']")).click();
		
		
	}

}
