package tek.capstone.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;

public class AccountPageSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("User click on account button");
	}

	@When("User update Name {string} and Password {string}")
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
//		waitTillPresence(factory.accountPage().changePasswordMassage);
//		Assert.assertTrue(isElementDisplayed(factory.accountPage().changePasswordMassage));
//		logger.info("user can see the massage: Password Updated Successfully");

//		waitTillClickable(factory.accountPage().paymentMethodMassageDidplayed);
//		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentMethodMassageDidplayed));
//		logger.info("user can see the massage: Card added Successfully");

//		waitTillPresence(factory.accountPage().editDebitOrCreditCardMassageDidplayed);
//		Assert.assertTrue(isElementDisplayed(factory.accountPage().editDebitOrCreditCardMassageDidplayed));
//		logger.info("User successfully edited Debit or Credit Card information");

//		waitTillPresence(factory.accountPage().addressAddeMassageBar);
//		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressAddeMassageBar));
//		logger.info("User successfully added address");

		waitTillPresence(factory.accountPage().editressAddeMassageBar);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().editressAddeMassageBar));
		logger.info("User successfully updatet address");
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

	}

	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAddressOption);
		logger.info("User click on add your address option");

	}

	@When("User fill new address form with belew information")
	public void userFillNewAddressFormWithBelewInformation(DataTable dataTable) {
		List<Map<String, String>> addressField = dataTable.asMaps(String.class, String.class);
		Select countrySelection = new Select(factory.accountPage().addCountryInAddressField);
		countrySelection.selectByValue(addressField.get(0).get("country"));
		sendText(factory.accountPage().addFullNameInAddressField, addressField.get(0).get("fullName"));
		sendText(factory.accountPage().addPhoneNumberInAddressField, addressField.get(0).get("phoneNumber"));
		sendText(factory.accountPage().addAddressInAddressField, addressField.get(0).get("streetAddress"));
		sendText(factory.accountPage().addAptInAddressField, addressField.get(0).get("apt"));
		sendText(factory.accountPage().addCityInAddressField, addressField.get(0).get("city"));
		Select stateField = new Select(factory.accountPage().addStateInAddressField);
		stateField.selectByValue(addressField.get(0).get("state"));
		sendText(factory.accountPage().addZipCodeInAddressField, addressField.get(0).get("zipCode"));
		logger.info("User fill the address form");
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
		List<Map<String, String>> editAddressField = dataTable.asMaps(String.class, String.class);
		Select editCountyField = new Select(factory.accountPage().editCountryInAddressField);
		editCountyField.selectByValue(editAddressField.get(0).get("country"));
		clearTextUsingSendKeys(factory.accountPage().editFullNameInAddressField);
		sendText(factory.accountPage().editFullNameInAddressField, editAddressField.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.accountPage().editAddressInAddressField);
		sendText(factory.accountPage().editAddressInAddressField, editAddressField.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.accountPage().editAptInAddressField);
		sendText(factory.accountPage().editAptInAddressField, editAddressField.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountPage().editCityInAddressField);
		sendText(factory.accountPage().editCityInAddressField, editAddressField.get(0).get("city"));
		Select editStateField = new Select(factory.accountPage().editStateInAddressField);
		editStateField.selectByValue(editAddressField.get(0).get("state"));
		clearTextUsingSendKeys(factory.accountPage().editZipCodeInAddressField);
		sendText(factory.accountPage().editZipCodeInAddressField, editAddressField.get(0).get("zipCode"));
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
