package com.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExample {

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

		driver.get("https://proflowers.com");
		
		clickProduct(driver,"By the Candlelight Centerpiece");
		
		
		//driver.findElement(By.xpath("//b[text()='STANDARD']")).click();
		
		////a[text()='Fiesta Bouquet']//parent::span//parent::div//following-sibling::div[@class='text-meta tw-pt-2 font-cta']
		
		//a[text()='Fiesta Bouquet']//parent::span//parent::div//following-sibling::div[contains(@class,'product-tile')]
		
	}
	
	public static void clickProduct(WebDriver driver, String productName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='"+productName+"']")));
		
		String priceValue = driver.findElement(By.xpath("//a[text()='"+productName+"']//parent::span//parent::div//following-sibling::div[contains(@class,'product-tile')]")).getText();		
		System.out.println(productName + " - " + priceValue);
		driver.findElement(By.xpath("//img[@alt='"+productName+"']")).click();
		
	}

}
