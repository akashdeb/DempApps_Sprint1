package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "email") 
	public WebElement emailTextfield;
	
	@FindBy(id = "password") 
	public WebElement passwordTextfield;
	
	@FindBy(xpath = "//button[text()='Login']") 
	public WebElement loginButton;
	
	@FindBy(xpath = "//div[text()='Registered successfully']")
	public WebElement registerSuccessfulMsg;
	
	@FindBy(xpath = "//div[text()='Signin successful']")
	public WebElement signinSuccessfulMsg;
	
	public void loginUser(String email, String password) {
		emailTextfield.sendKeys(email);
		passwordTextfield.sendKeys(password);
		loginButton.click();
	}
	
	public boolean verifyRegisterSuccessfulMsg() {
		return registerSuccessfulMsg.isDisplayed();
	}
	
	public boolean verifySignInSuccessfulMsg() {
		return signinSuccessfulMsg.isDisplayed();
	}

}
