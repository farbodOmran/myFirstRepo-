package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup  {
	
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy (xpath = "//a[@id='orderLink']")
	public WebElement orderButton;
	
	@FindBy (xpath = "(//p[contains(text(),'Show Details')])[1]")
	public WebElement showDetailButton;
	
	@FindBy (xpath = "(//p[contains(text(),'Hide Details')])[1]")
	public WebElement hideDetailButton;
	
	@FindBy (xpath = "(//button[@id='cancelBtn'])")
	public WebElement cancelTheOrderButton;
	
	@FindBy (xpath = "//select[@id='reasonInput']")
	public WebElement reasonInputBar;
	
	@FindBy (xpath = "//button[@id='orderSubmitBtn']")
	public WebElement cancelOrderButton;
	
	@FindBy (xpath = "//p[contains(text(),'Your Order Has Been Cancelled')]")
	public WebElement cancelConformationMassage;
	
	@FindBy(xpath = "//button[@id='buyAgainBtn']")
	public WebElement buyAgainButton;
	
	@FindBy(xpath = "//button[@id='placeOrderBtn']" )
	public WebElement placeOrderButton;
	
	@FindBy(xpath = "//div[@class='checkout__address-item-selected checkout__address-item']")
	public WebElement addressPresentInOrderPage;
	
	@FindBy(xpath = "//div[@class=checkout__payment-item-column-image']")
	public WebElement creditDebitCardPresentInOrderPage;
	
	@FindBy (xpath = "(//button[@id='returnBtn'])[1]")
	public WebElement returnButton;
	
	@FindBy (xpath = "//select[@id='dropOffInput']")
	public WebElement droppOffInputBar;
	
	@FindBy (xpath = "//button[@id='orderSubmitBtn']")
	public WebElement returnOrderButton;
	
	@FindBy (xpath = "//p[contains(text(),'Return was successfull')]")
	public WebElement returnConformationMassage;
	
	@FindBy (xpath = "//button[@id='reviewBtn']")
	public WebElement reviewButton;
	
	@FindBy (xpath = "//input[@id='headlineInput']")
	public WebElement headLineInputRiviewSection;
	
	@FindBy (xpath = "//textarea[@id='descriptionInput']")
	public WebElement reviewInputSection;
	
	@FindBy (xpath = "//button[@id='reviewSubmitBtn']")
	public WebElement addYourRieviewButton;
	
	@FindBy (xpath = "//div[contains(text(),'Your review was added successfully')]")
	public WebElement reviewMassageBar;
	

}
