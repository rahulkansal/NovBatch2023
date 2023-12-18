package com.java.prcatice;

public class UsingInterfaceChildClass {

	public static void main(String[] args) {
		
		WebDriverClass driver;
		String browser = "chrome";
		
		// TODO Auto-generated method stub
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriverExample();
		//chromeDriverExample.get();
		//chromeDriverExample.click();
		}
		else {
			driver = new EdgeDriverExample();
		//edgeDriverExample.get();
		//edgeDriverExample.click();
		} 
		driver.get();
		driver.click();
		
	}

}
