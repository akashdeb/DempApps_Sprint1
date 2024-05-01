package genericUtils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public WebDriver driver;
	@BeforeSuite
	public void bs() {
		System.out.println("This is Before Suite");
	}
	@BeforeTest
	public void bt() {
		System.out.println("This is Before Test");
	}
	@BeforeClass
	public void bc() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("This is Before Class");
	}
	@BeforeMethod
	public void bm() {
		System.out.println("This is Before Method");
	}
	@AfterMethod
	public void am() {
		System.out.println("This is After Method");
	}
	@AfterClass
	public void ac() {
		driver.quit();
		System.out.println("This is After Class");
	}
	@AfterTest
	public void at() {
		System.out.println("This is After Test");
	}
	@AfterSuite
	public void as() {
		System.out.println("This is After Suite");
	}
	


}
