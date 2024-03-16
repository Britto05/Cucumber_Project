package stepDefinitions;

import org.openqa.selenium.Keys;

import io.cucumber.java.en.Given;
import pageObjects.AllMenuLinks_Page_Objects;
import pageObjects.MultiVendorP_O;

public class Purchase_MultiVendorPO {

	@Given("the Multi Vendor PO Link Verified")
	public void the_multi_vendor_po_link_verified() {
		AllMenuLinks_Page_Objects.Purchase.click();
		AllMenuLinks_Page_Objects.MultiVendorPO.click();
	}
	@Given("the new MPO Clicked")
	public void the_new_mpo_clicked() throws InterruptedException {
		MultiVendorP_O.NewMPO.click();
		//Thread.sleep(1500);
	}
	@Given("the Product Selected")
	public void the_product_selected() throws InterruptedException {
		Thread.sleep(1000);
		MultiVendorP_O.ProductDropDown.click();
		MultiVendorP_O.ProductInput.sendKeys("Tea" +Keys.ENTER);
	}
	@Given("the Party Selected")
	public void the_party_selected() throws InterruptedException {
		MultiVendorP_O.PartyDropDown.click();
		MultiVendorP_O.PartyInput.sendKeys("Joe" +Keys.ARROW_DOWN +Keys.ENTER);
		Thread.sleep(1000);
	}
	@Given("the QTY Selected")
	public void the_qty_selected() throws InterruptedException {
		MultiVendorP_O.quantity1.clear();
		//Thread.sleep(3000);
		MultiVendorP_O.quantity1.sendKeys("100");
	}
	@Given("the Rete Selected")
	public void the_rete_selected() throws InterruptedException {
		MultiVendorP_O.org_price1.clear();
		//Thread.sleep(2000);
		MultiVendorP_O.org_price1.sendKeys("1000");
	}
	@Given("the Tax Selected")
	public void the_tax_selected() {

	}
	@Given("the Tax Type Selected")
	public void the_tax_type_selected() {
		MultiVendorP_O.TaxType.click();
		MultiVendorP_O.TaxTypeInput.sendKeys("18" +Keys.ENTER);
	}
	@Given("the Discount Selected")
	public void the_discount_selected() throws InterruptedException {
		MultiVendorP_O.DiscountPercentage.clear();
		//Thread.sleep(2000);
		MultiVendorP_O.DiscountPercentage.sendKeys("5");
		MultiVendorP_O.MVPOSave.click();
		
//Edit:
		Thread.sleep(2000);
	    MultiVendorP_O.ActionBtn.click();
	    Thread.sleep(1500);
	    MultiVendorP_O.edit.click();
	    MultiVendorP_O.Template.click();
	    MultiVendorP_O.TemplateInput.sendKeys("with" +Keys.ENTER);
	    Thread.sleep(2000);
	    MultiVendorP_O.AdditionalCharge.click();
	    MultiVendorP_O.AdditionalChargeDD.click();
	    MultiVendorP_O.AdditionalChargeInput.sendKeys("service"+Keys.ARROW_DOWN+Keys.ENTER);
	    MultiVendorP_O.AddicharAmount.sendKeys("100");
	    MultiVendorP_O.AddCharTaxType.click();
	    MultiVendorP_O.AddCharTaxTypeInput.sendKeys("0.25"+Keys.ENTER);
	    MultiVendorP_O.Autoroundoff.click();
	    MultiVendorP_O.MVPOSave.click();
	    
	}
}
