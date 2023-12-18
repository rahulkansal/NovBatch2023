package com.java.prcatice;

public class DecisionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String browser = "chrome";
	
/*	if(browser.equalsIgnoreCase("chrome")) {
		System.out.println("Lunch chrome browser");
	}
	else if(browser.equalsIgnoreCase("edge")) {
		System.out.println("Lunch edge browser");
	}
	else {
		System.out.println("Lunch firefox browser");
	} */
	
	switch(browser) {
    case "chrome" :
       System.out.println("Lunch chrome browser"); 
      // break;
    case "firefox" :
    case "opera" :
       System.out.println("Lunch firefox & opera browser");
       break;
    case "edge" :
       System.out.println("Lunch edge browser");
    break;
    default :
       System.out.println("Invalid broswer");
 }


	}

}
