package tek.capstone.framework.steps;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;
import tek.capstone.framework.utilities.DataGeneratorUtility;

public class AccountPageSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("User click on account button");
	}

	@When("User update Name {string} and PhoneNumber {string}")
	public void userUpdateNameAndPassword(String string, String string2) {
		clearTextUsingSendKeys(factory.accountPage().inputeNameField);
		clearTextUsingSendKeys(factory.accountPage().inputePhonNumberField);
		sendText(factory.accountPage().inputeNameField, string);
		sendText(factory.accountPage().inputePhonNumberField, string2);
		logger.info("User write new name and new phone number in name and phone number field");

	}

	@When("User click on Update Button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().updateButton);
		logger.info("User click the update button");
	}

	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().massageBar);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().massageBar));
		logger.info("User get Personal Information Updated Successfully massage");
	}

	@When("User enter below information")
	public void userEnterBelowInformation(DataTable dataTable) {
		List<Map<String, String>> changePassword = dataTable.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().inputPreviousPasswordField);
		sendText(factory.accountPage().inputPreviousPasswordField, changePassword.get(0).get("value1"));
		sendText(factory.accountPage().inputNewPasswordField, changePassword.get(0).get("value2"));
		sendText(factory.accountPage().inputconfirmNewPasswordField, changePassword.get(0).get("value3"));
		logger.info("user enter new information in change password section");

	}

	@When("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountPage().changePasswordButton);
		logger.info("User click on change password button");

	}

	@Then("a massage should be displayed {string}")
	public void aMassageShouldBeDisplayed(String string) {
		if (string.equals("Password Updated Successfully")) {
			waitTillPresence(factory.accountPage().samePasswordMassageBar);
			Assert.assertTrue(isElementDisplayed(factory.accountPage().samePasswordMassageBar));
			logger.info("user can see the massage: Password Updated Successfully");
		} else if (string.equals("Payment Method added successfully")) {
			waitTillClickable(factory.accountPage().paymentMethodMassageDidplayed);
			Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentMethodMassageDidplayed));
			logger.info("user can see the massage: Card added Successfully");
		} else if (string.equals("Payment Method updated Successfully")) {
			waitTillPresence(factory.accountPage().editDebitOrCreditCardMassageDidplayed);
			Assert.assertTrue(isElementDisplayed(factory.accountPage().editDebitOrCreditCardMassageDidplayed));
			logger.info("User successfully edited Debit or Credit Card information");
		} else if (string.equals("Address added successfully")) {
			waitTillPresence(factory.accountPage().addressAddeMassageBar);
			Assert.assertTrue(isElementDisplayed(factory.accountPage().addressAddeMassageBar));
			logger.info("User successfully added address");
		} else if (string.equals("Address Updatet Successfully")) {
			waitTillPresence(factory.accountPage().editressAddeMassageBar);
			Assert.assertTrue(isElementDisplayed(factory.accountPage().editressAddeMassageBar));
			logger.info("User successfully updatet address");
		}
	}

	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.accountPage().addPaymentMethodButton);
		logger.info("User click on Add a Payment Method");

	}

	@When("User fil Debit or Credit card information")
	public void userFilDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>> cardFields = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumberField, cardFields.get(0).get("cardNumber"));
		sendText(factory.accountPage().cardNameField, cardFields.get(0).get("nameOnCard"));
		Select selectMonth = new Select(factory.accountPage().expirationMonthField);
		selectMonth.selectByVisibleText(cardFields.get(0).get("expirationMonth"));
		Select selectYear = new Select(factory.accountPage().expirationYearField);
		selectYear.selectByValue(cardFields.get(0).get("expirationYear"));
		sendText(factory.accountPage().securityCodeField, cardFields.get(0).get("securityCode"));

	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().addYourCardButton);

	}

	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().cardEditOption);
		click(factory.accountPage().cardEditButton);
	}

	@When("User edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		clearTextUsingSendKeys(factory.accountPage().editCardNumberField);
		clearTextUsingSendKeys(factory.accountPage().editNameOnCardField);
		clearTextUsingSendKeys(factory.accountPage().editExpirationMonthField);
		clearTextUsingSendKeys(factory.accountPage().editExpirationYearField);
		clearTextUsingSendKeys(factory.accountPage().editSecurityCodeField);
		List<Map<String, String>> editCardField = dataTable.asMaps(String.class, String.class);
		sendText(factory.accountPage().editCardNumberField, editCardField.get(0).get("CardNumber"));
		sendText(factory.accountPage().editNameOnCardField, editCardField.get(0).get("nameOnCard"));
		Select editExpirationMonth = new Select(factory.accountPage().editExpirationMonthField);
		editExpirationMonth.selectByValue(editCardField.get(0).get("expirationMonth"));
		Select editExpirationYear = new Select(factory.accountPage().editExpirationYearField);
		editExpirationYear.selectByValue(editCardField.get(0).get("expirationYear"));
		sendText(factory.accountPage().editSecurityCodeField, editCardField.get(0).get("securityCode"));
		logger.info("User enter new information in edit card field");
	}

	@When("User click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().updateYourCardButton);
		logger.info("User click on update card button");
	}

	@When("User click on remove option")
	public void userClickOnRemoveOption() {
		click(factory.accountPage().cardRemoveOption);
		logger.info("User Click to remove the debit or credit card");
	}

	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().cardRemoveButtonOfCardSection);
		logger.info("User clock on remove card button");
	}

	@When("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addPaymentMethodButton));
		logger.info("user remove the card successfully");

	}

	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAddressOption);
		logger.info("User click on add your address option");

	}

	@When("User fill new address form with belew information")
	public void userFillNewAddressFormWithBelewInformation(DataTable dataTable) {

		List<List<String>> addAddressField = dataTable.asLists(String.class);
		selectByVisibleText(factory.accountPage().addCountryInAddressField,
				DataGeneratorUtility.data(addAddressField.get(0).get(0)));
		sendText(factory.accountPage().addFullNameInAddressField,
				DataGeneratorUtility.data(addAddressField.get(0).get(1)));
		sendText(factory.accountPage().addPhoneNumberInAddressField,
				DataGeneratorUtility.data(addAddressField.get(0).get(2)));
		sendText(factory.accountPage().addAddressInAddressField,
				DataGeneratorUtility.data(addAddressField.get(0).get(3)));
		sendText(factory.accountPage().addAptInAddressField, DataGeneratorUtility.data(addAddressField.get(0).get(4)));
		sendText(factory.accountPage().addCityInAddressField, DataGeneratorUtility.data(addAddressField.get(0).get(5)));
		selectByValue(factory.accountPage().addStateInAddressField,
				DataGeneratorUtility.data(addAddressField.get(0).get(6)));
		sendText(factory.accountPage().addZipCodeInAddressField,
				DataGeneratorUtility.data(addAddressField.get(0).get(7)));
		logger.info("user fill the address section based on faker class data");

	}

	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().addYourAddressButton);
		logger.info("User click on Add Your Address Button");
	}

	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().editAddressOption);
		logger.info("User click to edit address");
	}

	@When("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> editAddressField = dataTable.asLists(String.class);

		selectByValue(factory.accountPage().editCountryInAddressField,
				DataGeneratorUtility.data(editAddressField.get(0).get(0)));
		clearTextUsingSendKeys(factory.accountPage().editFullNameInAddressField);
		sendText(factory.accountPage().editFullNameInAddressField,
				DataGeneratorUtility.data(editAddressField.get(0).get(1)));
		clearTextUsingSendKeys(factory.accountPage().editPhoneNumberInAddressField);
		sendText(factory.accountPage().editPhoneNumberInAddressField,
				DataGeneratorUtility.data(editAddressField.get(0).get(2)));
		clearTextUsingSendKeys(factory.accountPage().editAddressInAddressField);
		sendText(factory.accountPage().editAddressInAddressField,
				DataGeneratorUtility.data(editAddressField.get(0).get(3)));
		clearTextUsingSendKeys(factory.accountPage().editAptInAddressField);
		sendText(factory.accountPage().editAptInAddressField,
				DataGeneratorUtility.data(editAddressField.get(0).get(4)));
		clearTextUsingSendKeys(factory.accountPage().editCityInAddressField);
		sendText(factory.accountPage().editCityInAddressField,
				DataGeneratorUtility.data(editAddressField.get(0).get(5)));
		selectByValue(factory.accountPage().editStateInAddressField,
				DataGeneratorUtility.data(editAddressField.get(0).get(6)));
		clearTextUsingSendKeys(factory.accountPage().editZipCodeInAddressField);
		sendText(factory.accountPage().editZipCodeInAddressField,
				DataGeneratorUtility.data(editAddressField.get(0).get(7)));
		logger.info("User fill the new information for updating address");
	}

	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.accountPage().editYourAddressButton);
		logger.info("User click on update address button");
	}

	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().removeAddressOption);
		logger.info("User click on remove button on address field to remove address");
	}

	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addAddressOption));
		logger.info("User successfully remove address");
	}

}
