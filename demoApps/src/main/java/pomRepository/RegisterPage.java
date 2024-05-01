package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public RegisterPage(WebDriver driver) {
		//This inititiallizes @FindBy
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "name") 
	public WebElement nameTextfield;
	
	@FindBy(id = "email") 
	public WebElement emailTextfield;
	
	@FindBy(id = "password") 
	public WebElement passwordTextfield;
	
	@FindBy(xpath = "//button[text()='Register']") 
	public WebElement registerButton;
	
	//Business Logic 
	public void registerUser(String name, String email, String password) {
		nameTextfield.sendKeys(name);
		emailTextfield.sendKeys(email);
		passwordTextfield.sendKeys(password);
		registerButton.click();
	}

}
