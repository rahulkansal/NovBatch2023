package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsExample {

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

		driver.get("https://google.com");
		
		//driver.findElement(By.id("APjFqb")).sendKeys("Rahul Automation");
		
		//driver.findElement(By.className("gLFyf")).sendKeys("Rahul Automation");
		
		//driver.findElement(By.name("q")).sendKeys("Rahul Automation");
		
		//driver.findElement(By.linkText("हिन्दी")).click();
		
		//Thread.sleep(3000);
		
		//driver.findElement(By.partialLinkText("Eng")).click();
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys("Rahul Automation");
		
		//driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("Rahul Automation");
		
		//driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).clear();
		
		driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("Rahul Automation Studio");
		
		driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys(Keys.ENTER);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		
		for(int i= 0 ;i<links.size();i++) {
			System.out.println(links.get(i).getText());
			
		}	
		
	}

}
