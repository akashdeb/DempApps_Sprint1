package testNg;

import org.testng.annotations.Test;

public class GroupExecution {
	
	@Test(priority = 1, groups = "smoke")
	public void register() {
		System.out.println("The user has registered");
	}
	

	@Test(priority = 2, groups = "smoke")
	public void login() {
		System.out.println("The user has logged in");
	}
	
	@Test(priority = 3, groups = "regression")
	public void addProduct() {
		System.out.println("The product is found");
	}
	
	@Test(priority = 4, groups = "regression")
	public void payment() {
		System.out.println("Payment is done");
	}
	
	@Test(priority = 5, groups = "smoke")
	public void logout() {
		System.out.println("The user has logged out");
	}


}
