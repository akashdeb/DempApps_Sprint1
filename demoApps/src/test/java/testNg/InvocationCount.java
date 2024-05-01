package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationCount {

	@Test(priority = 1)
	public void register() {
		System.out.println("The user has registered");
	}
	

	@Test(priority = 2)
	public void login() {
		System.out.println("The user has logged in");
	}
	
	@Test(priority = 3, invocationCount = 3)
	public void addProduct() {
		
		System.out.println("The product is found");
	}
	
	@Test(priority = 4, dependsOnMethods = "addProduct")
	public void payment() {
		System.out.println("Payment is done");
	}
	
	@Test(priority = 5, dependsOnMethods = "login")
	public void logout() {
		System.out.println("The user has logged out");
	}


}
