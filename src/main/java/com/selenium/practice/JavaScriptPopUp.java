package com.selenium.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptPopUp {

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

		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		
		driver.findElement(By.id("button4")).click();
		
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		
		String value = alert.getText();
		
		System.out.println(value);
		
		//alert.accept();
		
		alert.dismiss();
	}

}
