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
        
        for(int i = 0; i < expectedDepartmentOption.get(0).size();i++) {
        	for(WebElement options: actualDepartmentOption) {
        		if(options.getText().equals(expectedDepartmentOption.get(0).get(i))) {
        		  	Assert.assertTrue(isElementDisplayed(options));
        		  	logger.info(options.getText()+ " is present");
        		}
        	}
        }
	}

}
