package testNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PostPoneAssertion {
	
	@Test
	public void test1() {
		
		String actualResult = "Qspiders";
		String expectedResult = "Qspiders";
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actualResult, expectedResult);
		System.out.println("the results are matching====>Before Assertion");

		sa.assertAll();
		System.out.println("the results are matching=====>After Assertion");	
		
	}
	
	@Test
	public void test2() {
		
		String actualResult = "Qspiders";
		String expectedResult = "spiders";
		
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(actualResult.contains(expectedResult));
		System.out.println("the results are matching====>Before Assertion");

		sa.assertAll();
		System.out.println("the results are matching=====>After Assertion");	
		
	}
	
	

}
