package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleCrossBrowser {
	@Parameters("browser")
	@Test
	public void googleTest(String browser) {
		WebDriver driver=null;
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		
		if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		if(browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		
		driver.get("https://www.google.co.in/");
	}

}
