package tek.capstone.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;
import tek.capstone.framework.utilities.DataGeneratorUtility;

public class SignInSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();

	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signInButton);
		logger.info("User click on Sign In Button");

	}

	@When("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String string, String string2) {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().signInLogo));
		clearTextUsingSendKeys(factory.signInPage().emailInputField);
		clearTextUsingSendKeys(factory.signInPage().passwordInputField);
		sendText(factory.signInPage().emailInputField, string);
		sendText(factory.signInPage().passwordInputField, string2);
		logger.info("User enter email and password in sign in page");
	}

	@When("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().logInButton);
		logger.info("User click the log In Button");

	}

	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().logOutButton));

	}

	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signInPage().createNewAccountButton);
		logger.info("user click on new account button");
	}

	@When("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
		List<List<String>> signUpInformation = dataTable.asLists(String.class);
		sendText(factory.signInPage().signUpNameField, DataGeneratorUtility.data(signUpInformation.get(0).get(0)));
		sendText(factory.signInPage().signUpEmailField, DataGeneratorUtility.data(signUpInformation.get(0).get(1)));
		sendText(factory.signInPage().signUpPasswordField, signUpInformation.get(1).get(2));
		sendText(factory.signInPage().signUpConfirmPassField, signUpInformation.get(1).get(3));
		logger.info("user filled the signUp information form");
	
	}
	@Then("User click on SignUp button")
	public void userClickOnSignUpButton() {
	    click(factory.signInPage().signUpButton);
	    logger.info("User clicked on sign up button");
	
	}
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		waitTillPresence(factory.homePage().accountOption);
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));
	   
	}
	

}
