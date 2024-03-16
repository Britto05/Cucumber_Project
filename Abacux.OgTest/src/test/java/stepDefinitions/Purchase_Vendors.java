package stepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AllMenuLinks_Page_Objects;
import pageObjects.Vendors_Page_Objects;
import webDriverManager.DriverManager;

public class Purchase_Vendors {


	@Given("Login Page Verified to Check the Vendor Add Function")
	public void login_page_verified_to_check_the_vendor_add_function() {
	}
	@Given("the Purchase Verified")
	public void the_purchase_verified() {
		AllMenuLinks_Page_Objects.Purchase.click();
	}
	@Given("the Vendors Verified to check the Add Vendor option")
	public void the_vendors_verified_to_check_the_add_vendor_option() {
		AllMenuLinks_Page_Objects.Vendors.click();
	}
	@Given("Click the New Vendor option")
	public void click_the_new_vendor_option() {
		Vendors_Page_Objects.AddNewVendor.click();
	}
	@Given("Vendor Type Business has been Selected")
	public void vendor_type_business_has_been_selected() {

	}
	@Given("Company name has been entered")
	public void company_name_has_been_entered() {
		Vendors_Page_Objects.CompanyName.sendKeys("Amazonss");
	}
	@Given("Salutation has been selected")
	public void salutation_has_been_selected() throws InterruptedException {
		Vendors_Page_Objects.SalutationDropDown.click();
		//Thread.sleep(2000);
		Vendors_Page_Objects.SalutaionInput.sendKeys("Dr" +Keys.ENTER);

	}
	@Given("Frist Name has been Entered")
	public void frist_name_has_been_entered() {
		Vendors_Page_Objects.FirstName.sendKeys("Johnnnn");
	}
	@Given("Last Name has been Entered")
	public void last_name_has_been_entered() {
		Vendors_Page_Objects.LastName.sendKeys("Brittoooo");
	}
	@Given("Nick Name has been Entered")
	public void nick_name_has_been_entered() {
		Vendors_Page_Objects.nick_name.sendKeys("JBTest");
	}
	@Given("company name exists in the display name")
	public void company_name_exists_in_the_display_name() {
		String visibleTextOnPage = DriverManager.getDriver().findElement(By.id("select2-vendor_display_name-container")).getText();
		Assert.assertTrue(visibleTextOnPage.contains("Amazon"));
	}
	@Given("company name exists in the Billing name")
	public void company_name_exists_in_the_billing_name() {
		String visibleTextOnPage = DriverManager.getDriver().findElement(By.id("select2-vendor_billing_name-container")).getText();
		Assert.assertTrue(visibleTextOnPage.contains("Amazon"));
	}
	@Given("Conatact Number has been Entered")
	public void conatact_number_has_been_entered() {
		Vendors_Page_Objects.PrimaryMobileNo.sendKeys("9750716132");
	}
	@Given("Whatsapp number entered same as contact number")
	public void whatsapp_number_entered_same_as_contact_number() {
		Vendors_Page_Objects.WhatsappnumberCheckbox.click();
	}
	@Given("Vendor Email has been entered")
	public void vendor_email_has_been_entered() {
		Vendors_Page_Objects.vendor_gmail.sendKeys("amazon@gmail.com");
	}
	@Given("opeing balance has been entered")
	public void opeing_balance_has_been_entered() {
		Vendors_Page_Objects.opening_balance.sendKeys("5000");
	}
	@Given("As of Date has been Selected")
	public void as_of_date_has_been_selected() {
		Vendors_Page_Objects.AsofDatePicker.sendKeys("14-09-2023"+Keys.TAB);
	}
	@Given("Terms has beed selected")
	public void terms_has_beed_selected() {
		Vendors_Page_Objects.Terms.click();
		Vendors_Page_Objects.TermsInputField.sendKeys("net 15"+Keys.ENTER);

	}
	@Given("Account Type has been verified its a Account Payable")
	public void account_type_has_been_verified_its_a_account_payable() throws InterruptedException {
		String visibleTextOnPage = DriverManager.getDriver().findElement(By.id("select2-vendor_parentaccount_id-container")).getText();
		Assert.assertTrue(visibleTextOnPage.contains("Account Payable"));
		
		Thread.sleep(4000);
	}
	@Given("Tax Details are Entered")
	public void tax_details_are_entered() throws InterruptedException {
		Vendors_Page_Objects.GstTreatment.click();
		Vendors_Page_Objects.GstInputField.sendKeys("Regular" +Keys.ENTER);
		Vendors_Page_Objects.gstin_no.sendKeys("33AAJFJ3267H1ZC");
		Thread.sleep(2000);
		Vendors_Page_Objects.SourceOfSupply.click();
		Vendors_Page_Objects.SoSInputField.sendKeys("Tamil" +Keys.ENTER +Keys.ARROW_DOWN);
		Thread.sleep(2000);
		Vendors_Page_Objects.GSTValidate.click();
		Thread.sleep(4000);
	}
	@Given("Address Details are Entered")
	public void address_details_are_entered() throws InterruptedException {
		Thread.sleep(1000);
		Vendors_Page_Objects.AddressTab.click();
		Vendors_Page_Objects.vendor_attention.sendKeys("John");
		Vendors_Page_Objects.Country.click();
		Vendors_Page_Objects.CountryInput.sendKeys("india" + Keys.ENTER);
		Vendors_Page_Objects.Address.sendKeys("No.1, Theni Main Road" +Keys.TAB +Keys.ENTER);
		Thread.sleep(2000);
		Vendors_Page_Objects.StateInput.sendKeys("Tamil nadu" + Keys.ENTER +Keys.TAB +Keys.ENTER);
		Thread.sleep(2000);
		Vendors_Page_Objects.CityInput.sendKeys("Madurai" +Keys.ENTER);
		Vendors_Page_Objects.Town.sendKeys("Checkanam");
		Vendors_Page_Objects.vendor_zipcode.sendKeys("621307");
		Vendors_Page_Objects.vendor_phone.sendKeys("04332260260");
		Vendors_Page_Objects.vendor_fax.sendKeys("123456789");
		Thread.sleep(4000);
		Vendors_Page_Objects.SameAsBillingAddress.click();
	}
	@Given("Bank Details are Entered")
	public void bank_details_are_entered() throws InterruptedException {
		Vendors_Page_Objects.BankDetailsTab.click();
		Vendors_Page_Objects.beneficiary_name.sendKeys("John");
		Vendors_Page_Objects.bank_name.sendKeys("SBI");
		Vendors_Page_Objects.account_number.sendKeys("98765432101");
		Vendors_Page_Objects.reenter_account_number.sendKeys("98765432101");
		Vendors_Page_Objects.ifsc.sendKeys("SBI000995");
		Vendors_Page_Objects.AddBank.click();
		Vendors_Page_Objects.beneficiary_name2.sendKeys("John");
		Vendors_Page_Objects.bank_name2.sendKeys("SBI");
		Vendors_Page_Objects.account_number2.sendKeys("98765432101");
		Vendors_Page_Objects.reenter_account_number2.sendKeys("98765432101");
		Vendors_Page_Objects.ifsc2.sendKeys("SBI000995");
		Thread.sleep(4000);

	}
	@Given("Remarks Entered")
	public void remarks_entered() throws InterruptedException {
		Vendors_Page_Objects.RemarksTab.click();
		Vendors_Page_Objects.remarks.sendKeys("This is Remark Field");
		Thread.sleep(4000);
	}
	@Given("Other Details are Entered")
	public void other_details_are_entered() throws InterruptedException {
		Vendors_Page_Objects.OtherDetailsTab.click();
		Vendors_Page_Objects.facebook_url.sendKeys("Facbook");
		Vendors_Page_Objects.twitter_url.sendKeys("Twitter");
		Vendors_Page_Objects.location_url.sendKeys("Location");
		Thread.sleep(4000);
	}
	@Given("Details are Saved")
	public void details_are_saved() throws InterruptedException {
		Vendors_Page_Objects.vendors_submit.click();
		Thread.sleep(2000);
	}

	//Vendor Edit:
	@Given("the Action Button Verified")
	public void the_action_button_verified() {
		//AllMenuLinks_Page_Objects.Purchase.click();
		//AllMenuLinks_Page_Objects.Vendors.click();
		Vendors_Page_Objects.ActionBtn.click();
	}
	@Given("the Edit option Verified")
	public void the_edit_option_verified() throws InterruptedException {
		Vendors_Page_Objects.VendorEdit.click();
		Vendors_Page_Objects.CompanyName.clear();
		Vendors_Page_Objects.CompanyName.sendKeys("Flipkart");
		Vendors_Page_Objects.vendors_submit.click();
		Thread.sleep(4000);
	}
	@Given("the Delete option verified")
	public void the_delete_option_verified() throws InterruptedException {
		Vendors_Page_Objects.ActionBtn.click();
		Vendors_Page_Objects.VendorDelete.click();
		Alert alert = DriverManager.getDriver().switchTo().alert();
		alert.accept();
		//alert.dismiss();
		Thread.sleep(4000);

	}
	@Given("the View option verified")
	public void the_view_option_verified() {
		Vendors_Page_Objects.ActionBtn.click();
		Vendors_Page_Objects.VendorView.click();
		//DriverManager.getDriver().navigate().back();
	}

}
