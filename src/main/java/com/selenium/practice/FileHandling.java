package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FileHandling {

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

		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		
		driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\rniwas2\\eclipse-workspace\\NovWeekDysBatch2023\\failed_2.png");
		}

}
