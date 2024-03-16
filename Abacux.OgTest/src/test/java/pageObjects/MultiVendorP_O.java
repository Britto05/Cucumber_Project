package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultiVendorP_O {

	private static MultiVendorP_O multivendorInstance;
	private MultiVendorP_O(){
	}
	public static MultiVendorP_O getInstance() {
		if(multivendorInstance==null) {
			multivendorInstance=new MultiVendorP_O();
		}
		return multivendorInstance;
	}
	
	@FindBy(id = "addmodal")
	public static WebElement NewMPO;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div[1]/div/div/div/div[2]/form/div[3]/table/tbody/tr/td[2]/div/span/span[1]/span")
	public static WebElement ProductDropDown;
	
	@FindBy(xpath = "/html/body/span/span/span[1]/input")
	public static WebElement ProductInput;
	
	@FindBy(xpath = "//*[@id=\"partygroup1\"]/span/span[1]/span")
	public static WebElement PartyDropDown;
	
	@FindBy(xpath = "/html/body/span/span/span[1]/input")
	public static WebElement PartyInput;
	
	@FindBy(id = "quantity1")
	public static WebElement quantity1;
	
	@FindBy(id = "org_price1")
	public static WebElement org_price1;
	
	@FindBy(id = "select2-inclusive_tax1-container")
	public static WebElement Tax;
	
	@FindBy(xpath = "/html/body/span/span/span[1]/input")
	public static WebElement TaxInput;
	
	@FindBy(xpath = "//*[@id=\"rec-1\"]/td[9]/div/span[1]/span[1]/span")
	public static WebElement TaxType;
	
	@FindBy(xpath = "/html/body/span/span/span[1]/input")
	public static WebElement TaxTypeInput;
	
	@FindBy(id = "discount1")
	public static WebElement DiscountPercentage;
	
	@FindBy(id = "onlysave")
	public static WebElement MVPOSave;
	
	@FindBy(xpath = "/html/body/div[2]/div[5]/div[1]/div/div[4]/div[2]/div/div[1]/div/table/tbody/tr[1]/td[7]/div/ul/li/div/a/i")
	public static WebElement ActionBtn;
	
	@FindBy(xpath = "/html/body/ul/li[1]/a/button")
	public static WebElement edit;
	
	@FindBy(id = "select2-template_id-container")
	public static WebElement Template;
	
	@FindBy(xpath = "/html/body/span/span/span[1]/input")
	public static WebElement TemplateInput;
	
	@FindBy(id = "add_new_addtioanl_charge")
	public static WebElement AdditionalCharge;
	
	@FindBy(id = "select2-addtional_charge_name1-container")
	public static WebElement AdditionalChargeDD;
	
	@FindBy(xpath = "/html/body/span/span/span[1]/input")
	public static WebElement AdditionalChargeInput;
	
	@FindBy(id = "addtional_charge_amount1")
	public static WebElement AddicharAmount;
	
	@FindBy(id = "select2-additional_tax_type1-container")
	public static WebElement AddCharTaxType;
	
	@FindBy(xpath = "/html/body/span/span/span[1]/input")
	public static WebElement AddCharTaxTypeInput;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div[1]/div/div/div/div[2]/form/div[6]/div/div/div[9]/div[1]/div/label")
	public static WebElement Autoroundoff;
	
	
	
	
	
	
	
	
}
