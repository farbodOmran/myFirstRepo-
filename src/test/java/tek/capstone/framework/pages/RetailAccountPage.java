package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//input[@id='nameInput']")
	public WebElement inputeNameField;
	
	@FindBy(xpath = "//input[@id='personalPhoneInput']")
	public WebElement inputePhonNumberField;
	
	@FindBy(xpath = "//button[@id='personalUpdateBtn']")
	public WebElement updateButton;
	
	@FindBy(xpath = "//div[contains(text(),'Personal Information Updated Successfully')]")
	public WebElement massageBar;
	
	@FindBy(xpath = "//input[@name='previousPassword']")
	public WebElement inputPreviousPasswordField;
	
	@FindBy(xpath = "//input[@id='newPasswordInput']")
	public WebElement inputNewPasswordField;
	
	@FindBy(xpath = "//input[@id='confirmPasswordInput']")
	public WebElement inputconfirmNewPasswordField;
	
	@FindBy(xpath = "//button[@id='credentialsSubmitBtn']")
	public WebElement changePasswordButton;
	
	@FindBy(xpath = "//div[contains(text(),'Password Updated Successfully')]")
	public WebElement changePasswordMassage;
	
	@FindBy(xpath = "//p[text()='Add a payment method']")
	public WebElement addPaymentMethodButton;
	
	@FindBy(xpath = "//input[@id='cardNumberInput']")
	public WebElement cardNumberField;
	
	@FindBy(xpath = "//input[@id='nameOnCardInput']")
	public WebElement cardNameField;
	
	@FindBy(xpath = "//select[@id='expirationMonthInput']")
	public WebElement expirationMonthField;
	
	@FindBy(xpath = "//select[@id='expirationYearInput']")
	public WebElement expirationYearField;
	
	@FindBy(xpath = "//input[@id='securityCodeInput']")
	public WebElement securityCodeField;
	
	@FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	public WebElement addYourCardButton;
	
	@FindBy(xpath = "//div[contains(text(),'Payment Method added sucessfully')]")
	public WebElement paymentMethodMassageDidplayed;
	
	@FindBy (xpath = "//p[@class='account__payment-sub-title']")
	public WebElement cardEditOption;
	
	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement cardEditButton;
	
	@FindBy(xpath = "//input[@id='cardNumberInput']")
	public WebElement editCardNumberField;
	
	@FindBy(xpath = "//input[@id='nameOnCardInput']")
	public WebElement editNameOnCardField;
	
	@FindBy(xpath = "//select[@id='expirationMonthInput']")
	public WebElement editExpirationMonthField;

	@FindBy(xpath = "//select[@id='expirationYearInput']")
	public WebElement editExpirationYearField;
	
	@FindBy(xpath = "//input[@id='securityCodeInput']")
	public WebElement editSecurityCodeField;
	
	@FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	public WebElement updateYourCardButton;
	
	@FindBy(xpath = "//div[contains(text(),'Payment Method updated Successfully')]")
	public WebElement editDebitOrCreditCardMassageDidplayed;
	
	@FindBy(xpath = "//p[@class='account__payment-sub-title']")
	public WebElement cardRemoveOption;
	
	@FindBy(xpath = "//button[contains(text(),'remove')]")
	public WebElement cardRemoveButtonOfCardSection;
	
	@FindBy(xpath = "//p[@class='account__payment-sub-title']")
	public WebElement disappearCardRemoveOption;
	
	@FindBy(xpath = "//p[contains(text(),'Add Address')]")
	public WebElement addAddressOption;
	
	@FindBy (id = "countryDropdown")
	public WebElement addCountryInAddressField;
	
	@FindBy(id = "fullNameInput")
	public WebElement addFullNameInAddressField;
	
	@FindBy (xpath = "//input[@id='phoneNumberInput']")
	public WebElement addPhoneNumberInAddressField;
	
	@FindBy (xpath = "//input[@id='streetInput']")
	public WebElement addAddressInAddressField;
	
	@FindBy(xpath="//input[@id='apartmentInput']")
	public WebElement addAptInAddressField;
	
	@FindBy (xpath = "//input[@id='cityInput']")
	public WebElement addCityInAddressField;
	
	@FindBy (xpath = "//select[@name='state'] ")
	public WebElement addStateInAddressField;
	
	@FindBy (xpath = "//input[@id='zipCodeInput']")
	public WebElement addZipCodeInAddressField;
	
	@FindBy (xpath = "//button[@id='addressBtn']")
	public WebElement addYourAddressButton;
	
	@FindBy (xpath = "//div[contains(text(),'Address Added Successfully')]")
	public WebElement addressAddeMassageBar;
	
	@FindBy(xpath = "//button[contains(text(),'Edit')]")
	public WebElement editAddressOption;
	
	@FindBy (id = "countryDropdown")
	public WebElement editCountryInAddressField;
	
	@FindBy(id = "fullNameInput")
	public WebElement editFullNameInAddressField;
	
	@FindBy (xpath = "//input[@id='phoneNumberInput']")
	public WebElement editPhoneNumberInAddressField;
	
	@FindBy (xpath = "//input[@id='streetInput']")
	public WebElement editAddressInAddressField;
	
	@FindBy(xpath="//input[@id='apartmentInput']")
	public WebElement editAptInAddressField;
	
	@FindBy (xpath = "//input[@id='cityInput']")
	public WebElement editCityInAddressField;
	
	@FindBy (xpath = "//select[@name='state'] ")
	public WebElement editStateInAddressField;
	
	@FindBy (xpath = "//input[@id='zipCodeInput']")
	public WebElement editZipCodeInAddressField;
	
	@FindBy (xpath = "//button[@id='addressBtn']")
	public WebElement editYourAddressButton;
	
	@FindBy (xpath = "//div[contains(text(),'Address Updated Successfully')]")
	public WebElement editressAddeMassageBar;
	
	@FindBy(xpath = "//button[contains(text(),'Remove')]")
	public WebElement removeAddressOption;
	

}
