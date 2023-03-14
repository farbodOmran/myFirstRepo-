package tek.capstone.framework.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class RetailSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));
		logger.info("user is on retail website");
		logger.info("Actual Title " + actualTitle + " Equals " + " ExpectedTitle " + expectedTitle);

	}

	@When("User search for {string} product")
	public void userSearchForProduct(String productValue) {
		sendText(factory.homePage().searchBar, productValue);
		click(factory.homePage().searchButton);
		logger.info("user searched for product " + productValue);
	}

	@When("User click on All Section")
	public void userClickOnAllSection() {
		click(factory.homePage().allIcon);
		logger.info("User click on all sidebar button");

	}

	@Then("blew option are present in Shop by Department sidebar")
	public void blewOptionArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		List<List<String>> expectedSidebar = dataTable.asLists(String.class);
		List<WebElement> actualSidebar = factory.homePage().allSectionSidebar;
		for (int i = 0; i < expectedSidebar.get(0).size(); i++) {
			Assert.assertEquals(actualSidebar.get(i).getText(), expectedSidebar.get(0).get(i));
			logger.info(actualSidebar.get(i).getText() + " is equal to " + expectedSidebar.get(0).get(i));
		}
	}

	@When("User on {string}")
	public void userOn(String department) {
		List<WebElement> sideBarOptions = factory.homePage().allSectionSidebar;
		for (WebElement options : sideBarOptions) {
			if (options.getText().equals(department)) {
				click(options);

				try {
					logger.info(options.getText() + " is present ");
				} catch (StaleElementReferenceException e) {

				}
				break;
			}
		}
	}

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {

		List<List<String>> expectedDepartmentOption = dataTable.asLists(String.class);
		List<WebElement> actualDepartmentOption = factory.homePage().allSectionSidebar;

		for (int i = 0; i < expectedDepartmentOption.get(0).size(); i++) {
			for (WebElement options : actualDepartmentOption) {
				if (options.getText().equals(expectedDepartmentOption.get(0).get(i))) {
					Assert.assertTrue(isElementDisplayed(options));
					logger.info(options.getText() + " is present");
				}
			}
		}
	}

	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String string) {
		selectByVisibleText(factory.homePage().categorySelectButton, string);
		logger.info("User change category to Smart Home");

	}

	@When("User search for an item {string}")
	public void userSearchForAnItem(String string) {
		sendText(factory.homePage().searchBar, string);
		logger.info("User search for specific product");
	}

	@When("User click on search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchButton);
		logger.info("User cclick on search button");

	}

	@When("User click on item")
	public void userClickOnItem() {
		click(factory.homePage().productNameButton);

	}

	@When("User select quantity {string}")
	public void userSelectQuantity(String string) {
		selectByVisibleText(factory.homePage().quantityBar, string);
		logger.info("User change the quantity of product");

	}

	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.homePage().addToCartButton);
		logger.info("User clicked on add to cart button");

	}

	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String string) {
		if (string.equals("2")) {
			Assert.assertTrue(isElementDisplayed(factory.homePage().cartSignWithQuantity));
			logger.info("User successfully add 2 product into cart");
		} else if (string.equals("5")) {
			Assert.assertTrue(isElementDisplayed(factory.homePage().cartSignWithQuantity));
			logger.info("User successfully add 5 product into cart");
		}

	}

	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		click(factory.homePage().cartButton);
		logger.info("User clicked on Cart Button");
	}

	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		click(factory.homePage().proccessToCheckoutButton);
		logger.info("User clicked on Proceed to Checkout button");
	}

	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
		click(factory.homePage().addNewAddressForShipping);
		logger.info("User clicked on Add New Address Button");

	}

	@Then("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
		click(factory.homePage().addNewPaymentMethodInCheckout);

	}

	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.homePage().pleaceYourOrderButton);

	}

	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayedOrderPlacedThanks(String string) {
		waitTillPresence(factory.homePage().orderPlacedMassageBar);
		Assert.assertTrue(isElementDisplayed(factory.homePage().orderPlacedMassageBar));
		logger.info("User Successfully placed the order");

	}

}
