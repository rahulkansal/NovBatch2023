package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
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

		driver.get("https://webdriveruniversity.com/Actions/index.html");
		
		Actions action = new Actions(driver);
		//WebElement element= driver.findElement(By.id("double-click"));
		
		//action.doubleClick(element).perform();
		
		//action.contextClick(element).perform();
		
		
		WebElement element= driver.findElement(By.xpath("//p[text()='Click and Hold!']"));
		
		
		//action.clickAndHold(element).perform();
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		action.dragAndDrop(draggable, droppable).perform();

		
		

	}

}
