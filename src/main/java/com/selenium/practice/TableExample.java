package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TableExample {

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

		driver.get("https://webdriveruniversity.com/Data-Table/index.html");
		
		System.out.println(driver.findElements(By.xpath("//table[@id='t01']//tr")).size());
		System.out.println(driver.findElements(By.xpath("//table[@id='t01']//tr[1]//th")).size());
		
		System.out.println(driver.findElement(By.xpath("//table[@id='t01']//tr[3]//td[1]")).getText());
	}

}
