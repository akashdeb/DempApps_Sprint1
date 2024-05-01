package webElements;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtils.BaseClass;
import pomRepository.LoginPage;
import pomRepository.RegisterPage;

public class ToRegisterAndLoginUserTest extends BaseClass {
	
	@Test(priority = 1)
	public void registerUser() {
		RegisterPage register = new RegisterPage(driver);
		LoginPage login = new LoginPage(driver);
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		register.registerUser("RamLal", "ramu@gmail.com", "ram123");
		
		Assert.assertTrue(login.verifyRegisterSuccessfulMsg());
		System.out.println("Pass: the user has registered");	
	}
	
	@Test(priority = 2)
	public void loginUser() {
		driver.get("https://demoapps.qspiders.com/ui/login");
		LoginPage login = new LoginPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(login.emailTextfield));
		login.loginUser("ramu@gmail.com", "ram123");
		
		wait.until(ExpectedConditions.elementToBeClickable(login.signinSuccessfulMsg));
		
		Assert.assertTrue(login.verifySignInSuccessfulMsg());
		System.out.println("Pass: the user has logged in");

					
		
	}

}
