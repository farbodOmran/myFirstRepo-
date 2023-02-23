package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//h1[contains(text(),'Sign in')]")
	public WebElement signInLogo;
	
	@FindBy(xpath = "//input[@id='email']")
	public WebElement emailInputField;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement passwordInputField;
	
	@FindBy(xpath = "//button[@id='loginBtn']")
	public WebElement logInButton;
	
	@FindBy(xpath = "//a[@id='newAccountBtn']")
	public WebElement createNewAccountButton;
	
	@FindBy(id = "nameInput")
	public WebElement signUpNameField;

	@FindBy(css = "#emailInput")
	public WebElement signUpEmailField;

	@FindBy(id = "passwordInput")
	public WebElement signUpPasswordField;

	@FindBy(xpath = "//input[@name='confirmPassword']")
	public WebElement signUpConfirmPassField;
	
	@FindBy (xpath = "//button[@id='signupBtn']")
	public WebElement signUpButton;


}
