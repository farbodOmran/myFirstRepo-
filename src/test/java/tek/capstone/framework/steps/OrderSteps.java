package tek.capstone.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class OrderSteps extends CommonUtility {

	POMFactory factory = new POMFactory();
	
	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
	    click(factory.orderPage().orderButton);
	    logger.info("User clicked on order button");
	    
	}
	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		click(factory.orderPage().hideDetailButton);
		click(factory.orderPage().showDetailButton);
		logger.info("User clicked on first item");
	
	}
	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.orderPage().cancelTheOrderButton);
		logger.info("User clicked on cancel the order buttom");
	   
	}
	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String string) {
		selectByVisibleText(factory.orderPage().reasonInputBar, string);
		logger.info("User select the return reson");
	    
	}
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().cancelOrderButton);
		logger.info("User clicked on cancel order button");
	  
	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String string) {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().cancelConformationMassage));
		logger.info("User successfully canceled the order and get the cancelation massage");
		Assert.assertTrue(isElementDisplayed(factory.orderPage().returnConformationMassage));
		logger.info("User successfully return the order and get the massage");
		
	   
	}
	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
	    click(factory.orderPage().returnButton);
	    logger.info("User clicked on return order button");
	    
	}
	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String string) {
		selectByVisibleText(factory.orderPage().reasonInputBar, string);
		logger.info("User select the return reson");
		
	}
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String string) {
		selectByVisibleText(factory.orderPage().droppOffInputBar, string);
		logger.info("User select the droppOff location");
	}
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().returnOrderButton);
		logger.info("User clicked on return order button");
	    
	}
	@When("User click on Review button")
	public void userClickOnReviewButton() {
	    click(factory.orderPage().reviewButton);
	    logger.info("Userclicked on review button");
	    
	}
	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadline(String string, String string2) {
	    sendText(factory.orderPage().headLineInputRiviewSection, string);
	    sendText(factory.orderPage().reviewInputSection, string2);
	    logger.info("User write a review");
	    
	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().addYourRieviewButton);
		logger.info("User clicked on add review button");
	    
	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String string) {
		waitTillPresence(factory.orderPage().reviewMassageBar);
		Assert.assertTrue(isElementDisplayed(factory.orderPage().reviewMassageBar));
		logger.info("User successfully add review and get the confirmation massage");
	   
	}
}
