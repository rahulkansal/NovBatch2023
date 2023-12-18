package TestNGTests;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority=1)
	public void login() {
		System.out.println("login");
	}
	
	@Test(priority=-4)
	public void product() {
		System.out.println("product");
	}
	
	@Test(priority=-1)
	public void cart() {
		System.out.println("cart");
	}
	
	@Test(priority=0)
	public void payment() {
		System.out.println("payment");
	}

}
