package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null ;
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}	
		
		driver.manage().window().maximize();

		driver.get("https://webdriveruniversity.com/");
		
		driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']")).click();
		
		//Store the ID of the original window
		String originalWindow = driver.getWindowHandle();
		//Loop through until we find a new window handle
		for (String windowHandle : driver.getWindowHandles()) {
			System.out.println(windowHandle);
		    if(!originalWindow.contentEquals(windowHandle)) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}	
		
		driver.findElement(By.id("text")).sendKeys("Rahulssdf");
		
		driver.close();
		

		driver.switchTo().window(originalWindow);
		
		driver.findElement(By.xpath("//h1[text()='CONTACT US']")).click();
		
		
		
	}

}
