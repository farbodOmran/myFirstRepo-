package tek.capstone.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//a[text()='TEKSCHOOL']")
	public WebElement tekSchoolLogo;

	@FindBy(id = "search")
	public WebElement allDepartmentDropDown;

	@FindBy(css = "#searchInput")
	public WebElement searchBar;

	@FindBy(xpath = "//button[@id='searchBtn']")
	public WebElement searchButton;

	@FindBy(linkText = "Sign in")
	public WebElement signInButton;

	@FindBy(id = "cartBtn")
	public WebElement cartButton;

	@FindBy(xpath = "//a[text()='Account']")
	public WebElement accountOption;

	@FindBy(xpath = "//button[@id='logoutBtn']")
	public WebElement logOutButton;

	@FindBy(id = "hamburgerBtn")
	public WebElement allIcon;

	@FindBy(xpath = "//div[@class='sidebar_content-item']/span")
	public List<WebElement> allSectionSidebar;

	@FindBy(xpath = "//span[contains(text(),'Electronics')]")
	public WebElement electronicInSidebar;

	@FindBy(xpath = "//span[contains(text(),'Computers')]")
	public WebElement computersInSidebar;

	@FindBy(xpath = "//span[contains(text(),'Smart Home')]")
	public WebElement smartHomeInSidebar;

	@FindBy(xpath = "//span[contains(text(),'Sports')]")
	public WebElement sportsInSidebar;

	@FindBy(xpath = "//span[contains(text(),'Automative')]")
	public WebElement automotiveInSidebar;

	@FindBy(xpath = "//select[@class='search__select']")
	public WebElement categorySelectButton;

	@FindBy(xpath = "//p[contains(text(),'Kasa Outdoor Smart Plug')]")
	public WebElement productKasaPlugButton;

	@FindBy(xpath = "//select[@class='product__select']")
	public WebElement quantityBar;

	@FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
	public WebElement addToCartButton;

	@FindBy(xpath = "//span[@id='cartQuantity']")
	public WebElement cartSignWithQuantity;
	
	@FindBy(xpath = "//button[@id='proceedBtn']")
	public WebElement proccessToCheckoutButton;
	
	@FindBy(xpath = "//button[@id='addAddressBtn']")
	public WebElement addNewAddressForShipping;
	
	@FindBy(xpath = "//button[@id='addPaymentBtn']")
	public WebElement addNewPaymentMethodInCheckout;
	
	@FindBy(xpath = "//button[@id='placeOrderBtn']")
	public WebElement pleaceYourOrderButton;
	
	@FindBy(xpath = "//div[contains(text(),'Order Placed Successfully')]")
	public WebElement orderPlacedMassageBar;
	
	@FindBy(xpath = "//p[contains(text(),'Apex Legends - 1,000 Apex Coins')]")
	public WebElement productApexLegend;
	
	

}