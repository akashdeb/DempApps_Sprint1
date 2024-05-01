package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	
	@Test
	public void test1() {
		
		int actualResult = 143;
		int expectedResult = 143;
		
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println("Pass: the results are matching");

	}
	
	@Test
	public void test2() {
		
		String actualResult = "Qspiders";
		String expectedResult = "spiders";
		
		Assert.assertTrue(actualResult.contains(expectedResult));
		System.out.println("Pass: the results are matching");

	}
	

}
